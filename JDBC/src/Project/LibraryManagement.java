package Project;

import java.sql.*;
import java.util.Scanner;

public class LibraryManagement {
    static final String DB_URL = "jdbc:mysql://localhost:3306/library?useSSL=false";
    static final String USER = "root"; // your DB username
    static final String PASS = "root"; // your DB password

    static Connection conn;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            while (true) {
                System.out.println("\nWelcome to Library");
                System.out.println("1. Add book");
                System.out.println("2. Check availability of book");
                System.out.println("3. Find a book with detailed info");
                System.out.println("4. Remove books");
                System.out.println("5. Issue a book");
                System.out.println("6. Return book");
                System.out.println("7. Check book holders");
                System.out.println("8. Register reader");
                System.out.println("9. Cancel reader's membership");
                System.out.println("10. Exit");
                System.out.print("Choose option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> addBook();
                    case 2 -> checkAvailability();
                    case 3 -> findBook();
                    case 4 -> removeBook();
                    case 5 -> issueBook();
                    case 6 -> returnBook();
                    case 7 -> checkBookHolders();
                    case 8 -> registerReader();
                    case 9 -> cancelMembership();
                    case 10 -> {
                        System.out.println("Goodbye!");
                        conn.close();
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void addBook() throws SQLException {
        scanner.nextLine();
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Total Copies: ");
        int copies = scanner.nextInt();

        String sql = "INSERT INTO books (title, author, total_copies, available_copies) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, title);
        stmt.setString(2, author);
        stmt.setInt(3, copies);
        stmt.setInt(4, copies);
        stmt.executeUpdate();
        System.out.println("Book added successfully.");
    }

    static void checkAvailability() throws SQLException {
        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();
        String sql = "SELECT available_copies FROM books WHERE book_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, bookId);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            int available = rs.getInt("available_copies");
            System.out.println(available > 0 ? "Available" : "Not Available");
        } else {
            System.out.println("Book not found.");
        }
    }

    static void findBook() throws SQLException {
        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();
        String sql = "SELECT * FROM books WHERE book_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, bookId);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            System.out.println("Title: " + rs.getString("title"));
            System.out.println("Author: " + rs.getString("author"));
            System.out.println("Total: " + rs.getInt("total_copies"));
            System.out.println("Available: " + rs.getInt("available_copies"));
        } else {
            System.out.println("Book not found.");
        }
    }

    static void removeBook() throws SQLException {
        System.out.print("Enter Book ID to remove: ");
        int bookId = scanner.nextInt();
        String sql = "DELETE FROM books WHERE book_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, bookId);
        int rows = stmt.executeUpdate();
        System.out.println(rows > 0 ? "Book removed." : "Book not found.");
    }

    static void issueBook() throws SQLException {
        System.out.print("Book ID: ");
        int bookId = scanner.nextInt();
        System.out.print("Reader ID: ");
        int readerId = scanner.nextInt();

        // Check availability
        String check = "SELECT available_copies FROM books WHERE book_id = ?";
        PreparedStatement checkStmt = conn.prepareStatement(check);
        checkStmt.setInt(1, bookId);
        ResultSet rs = checkStmt.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            String insert = "INSERT INTO issued_books (book_id, reader_id) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(insert);
            stmt.setInt(1, bookId);
            stmt.setInt(2, readerId);
            stmt.executeUpdate();

            String update = "UPDATE books SET available_copies = available_copies - 1 WHERE book_id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(update);
            updateStmt.setInt(1, bookId);
            updateStmt.executeUpdate();

            System.out.println("Book issued.");
        } else {
            System.out.println("Book not available.");
        }
    }

    static void returnBook() throws SQLException {
        System.out.print("Book ID: ");
        int bookId = scanner.nextInt();
        System.out.print("Reader ID: ");
        int readerId = scanner.nextInt();

        String delete = "DELETE FROM issued_books WHERE book_id = ? AND reader_id = ?";
        PreparedStatement stmt = conn.prepareStatement(delete);
        stmt.setInt(1, bookId);
        stmt.setInt(2, readerId);
        int rows = stmt.executeUpdate();

        if (rows > 0) {
            String update = "UPDATE books SET available_copies = available_copies + 1 WHERE book_id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(update);
            updateStmt.setInt(1, bookId);
            updateStmt.executeUpdate();
            System.out.println("Book returned.");
        } else {
            System.out.println("No such issue record.");
        }
    }

    static void checkBookHolders() throws SQLException {
        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();

        String sql = """
                SELECT r.reader_id, r.name, r.email
                FROM readers r
                JOIN issued_books ib ON r.reader_id = ib.reader_id
                WHERE ib.book_id = ?
                """;
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, bookId);
        ResultSet rs = stmt.executeQuery();
        System.out.println("Current Holders:");
        while (rs.next()) {
            System.out.println(rs.getInt("reader_id") + ": " + rs.getString("name") + " (" + rs.getString("email") + ")");
        }
    }

    static void registerReader() throws SQLException {
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        String sql = "INSERT INTO readers (name, email) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, email);
        stmt.executeUpdate();
        System.out.println("Reader registered.");
    }

    static void cancelMembership() throws SQLException {
        System.out.print("Enter Reader ID: ");
        int readerId = scanner.nextInt();

        // Optional: Check for unreturned books
        String check = "SELECT COUNT(*) FROM issued_books WHERE reader_id = ?";
        PreparedStatement checkStmt = conn.prepareStatement(check);
        checkStmt.setInt(1, readerId);
        ResultSet rs = checkStmt.executeQuery();
        rs.next();
        if (rs.getInt(1) > 0) {
            System.out.println("Reader must return all books before canceling membership.");
            return;
        }

        String sql = "DELETE FROM readers WHERE reader_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, readerId);
        int rows = stmt.executeUpdate();
        System.out.println(rows > 0 ? "Membership cancelled." : "Reader not found.");
    }
}

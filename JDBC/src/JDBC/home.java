package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class home {

	public static void main(String[] args) throws Exception {
		
		
//		Step 1: Load the driver into the memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Step 2: Establish the connection using that loaded driver
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbanksystem?useSSL=false", "root", "root");
		
//		Step 3: Display appropriate message on the console.
		System.out.println((c != null) ? "Database connected!" : "Database NOT connected!");

	}

}

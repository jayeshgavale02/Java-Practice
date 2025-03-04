package switchcase;

public class Monthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 2; // Static input: Change this number to test different months (1-12)
        int daysInMonth;

        switch (month) {
            case 1:
                daysInMonth = 31;
                System.out.println("Month " + month + " has " + daysInMonth + " days.");

                break;
            case 2:
                daysInMonth = 28; // Simplified, no leap year check
                System.out.println("Month " + month + " has " + daysInMonth + " days.");

                break;
            case 3:
                daysInMonth = 31;
                System.out.println("Month " + month + " has " + daysInMonth + " days.");

                break;
            case 4:
                daysInMonth = 30;
                System.out.println("Month " + month + " has " + daysInMonth + " days.");

                break;
            case 5:
                daysInMonth = 31;
                System.out.println("Month " + month + " has " + daysInMonth + " days.");

                break;
            case 6:
                daysInMonth = 30;
                System.out.println("Month " + month + " has " + daysInMonth + " days.");

                break;
            case 7:
                daysInMonth = 31;
                System.out.println("Month " + month + " has " + daysInMonth + " days.");

                break;
            case 8:
                daysInMonth = 31;
                System.out.println("Month " + month + " has " + daysInMonth + " days.");

                break;
            case 9:
                daysInMonth = 30;
                System.out.println("Month " + month + " has " + daysInMonth + " days.");

                break;
            case 10:
                daysInMonth = 31;
                System.out.println("Month " + month + " has " + daysInMonth + " days.");

                break;
            case 11:
                daysInMonth = 30;
                System.out.println("Month " + month + " has " + daysInMonth + " days.");

                break;
            case 12:
                daysInMonth = 31;
                System.out.println("Month " + month + " has " + daysInMonth + " days.");

                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                return;
        }

    
	}

}

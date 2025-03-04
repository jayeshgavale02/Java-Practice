package whiledowhile;

public class sumoffirstandlastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		int number = 898756;
		
		int leftnumber = number%10;
		
		while(number>10) {
			number/=10;
		}
		System.out.println(number+leftnumber);
	}

}

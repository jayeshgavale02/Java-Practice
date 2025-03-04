package whiledowhile;

public class findfirstandlastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int number = 456;
	
	int lastdigits =  number%10;

	while(number > 10) {
		number/=10;
	}
	System.err.println(number+ "  "+lastdigits);
	    
	}

}

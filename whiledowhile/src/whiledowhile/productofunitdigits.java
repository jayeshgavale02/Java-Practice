package whiledowhile;

public class productofunitdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5649;
		
        int sum =1;
		while(number > 0) {
			sum*=number%10;
			number/=10;
		}
		System.err.println(sum);
		   
	}

}

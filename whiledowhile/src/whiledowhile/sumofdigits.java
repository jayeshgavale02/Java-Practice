package whiledowhile;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1234;
		int sum = 0;
		while(number > 0) {
			sum = sum + number %10;
			number /= 10; 			
		}
		System.out.println(sum);

	}

}

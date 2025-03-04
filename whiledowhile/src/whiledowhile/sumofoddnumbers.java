package whiledowhile;

public class sumofoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1;
		int sum =0;
		while(number< 25) {
			if(number%2 == 1) {
				sum+=number;
			}
			number++;
		}
		System.out.println(sum);

	}

}

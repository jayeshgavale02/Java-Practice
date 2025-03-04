package whiledowhile;

public class numberofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int nummber = 44;
		int unitdigits=0;
		int count = 0;
		while(nummber != 0) {
			unitdigits = nummber/=10;
			count++;
		}
		System.out.println(count);
		
	}

}

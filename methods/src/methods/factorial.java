package methods;

public class factorial {

	public void factorialnumber(int number) {

		int f = 1;
		for(int i = 1; i<=number ; i++) {
			f*=i;
		}
		System.out.println(f);
		
	}
	
}

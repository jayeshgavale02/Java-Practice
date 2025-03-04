package forloop;

public class oddnumber {
	public static void main (String[] agrs) {
        int count = 0;
		for(int i = 1; i<= 25;i++) {
			if(i%2 == 1) {
			    count++;
			}
		}

		System.out.println(count);

	}
	
}

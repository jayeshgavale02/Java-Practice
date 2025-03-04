package whiledowhile;

public class printstart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		while(i<=5) {
		  int j = 1;   
		   while(j<=i) {
			     System.out.print("*");
			     j++;
		   }

        System.out.println("");
				i++;

		}

}
}
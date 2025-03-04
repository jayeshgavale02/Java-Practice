package whiledowhile;

public class printitsreversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int number = 123;
      int reverse = 0;
      while(number>0) {
    	  int lastdist = number%10;
          reverse = reverse * 10 + lastdist;
    	   number/=10;
 
      }
      System.out.println(reverse);
      
      
      

	}

}

package switchcase;

public class positivenegitive {
  
	public static void main (String[] agrs) {
		int number = -45;
		String res = "";
		
		if(number >= 0) {
			res = "positive";
		}else {
			res = "negtive";

		}
		switch(res) {
		case "negtive":
			System.out.println("This is negtive number");
         break;
		case "positive":
			System.out.println("This is positive number");
         break;
		 	
		
		}
	}
}

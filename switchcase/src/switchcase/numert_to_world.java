package switchcase;

public class numert_to_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number  = 45;
		int leftnumber = number / 10;
		int rightnumber = number % 10;
		 if ( number >= 100) {
   		System.out.println("Enter range of number 0-99");
         }
		  if (number < 20) {
		 switch (number) {
         case 0: 
        	 System.out.println("Zero"); 
        	 break;
         case 1:
        	 System.out.println("One");
        	 break;
         case 2:
        	 System.out.println("Two"); 
        	 break;
         case 3:
        	 System.out.println("Three");
        	 break;
         case 4:
        	 System.out.println("Four");
        	 break;
         case 5:
        	 System.out.println("Five"); 
        	 break;
         case 6:
        	 System.out.println("Six");
        	 break;
         case 7: System.out.println("Seven");
         	 break;
         case 8:
        	 System.out.println("Eight");
        	 break;
         case 9:
        	 System.out.println("Nine");
        	 break;
         case 10:
        	 System.out.println("Ten"); 
        	 break;
         case 11:
        	 System.out.println("Eleven"); 
        	 break;
         case 12:
        	 System.out.println("Twelve");
        	 break;
         case 13:
        	 System.out.println("Thirteen"); 
        	 break;
         case 14:
        	 System.out.println("Fourteen");
        	 break;
         case 15:
        	 System.out.println("Fifteen");
        	 break;
         case 16:
        	 System.out.println("Sixteen"); 
        	 break;
         case 17:
        	 System.out.println("Seventeen");
        	 break;
         case 18:
        	 System.out.println("Eighteen");
        	 break;
         case 19:
        	 System.out.println("Nineteen");
        	 break;
		 }
		}else {
		 switch(leftnumber ) {
		 case 2:
		   		System.out.println("twenty");
		   		break;
		 case 3:
		   		System.out.println("thirtty");
		   		break;
		 case 4:
		   		System.out.println("fourty");
		   		break;
		 case 5:
		   		System.out.println("fifty");
		   		break;
		 case 6:
		   		System.out.println("sixty");
		   		break;
		 case 7:
		   		System.out.println("seventy");
		   		break;
		 case 8:
		   		System.out.println("eighty");
		   		break;
		 case 9:
		   		System.out.println("ninety");
		   		break;
		

		 }
		 switch(rightnumber) {
		 case 1:
		   		System.out.println("one");
		   		break;
		 case 2:
		   		System.out.println("two");
		   		break;
		 case 3:
		   		System.out.println("three");
		   		break;
		 case 4:
		   		System.out.println("four");
		   		break;
		 case 5:
		   		System.out.println("five");
		   		break;
		 case 6:
		   		System.out.println("six");
		   		break;
		 case 7:
		   		System.out.println("seven");
		   		break;
		 case 8:
		   		System.out.println("eight");
		   		break;
		 case 9:
		   		System.out.println("nine");
		   		break;
		 case 0:
		   		System.out.println(" ");
		   		break;
		   		

		 }

     }
	}

}

package methods;

public class Adv_task {


//1. We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//For example:
//parrotTrouble(true, 6) → true
//parrotTrouble(true, 7) → false
//parrotTrouble(false, 6) → false
	
	public boolean parrotTrouble(boolean a,int hour) {
		if( a == true) {
			if(hour<7 || hour>20) {
				return true;
			}else {
				return false;
		 	}
		}else {
			return false;
		}
	}

//	2.  Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
	

//For example:
//makes10(9, 10) → true
//makes10(9, 9) → false
//makes10(1, 9) → true


	public boolean makes10(int a,int b) {
		if(a == 10 || b == 10) {
			return true;
		}else if(a+b == 10){
			return true;
		}else {
			return false;

		}
	}
	
//	3. Given 2 int values, return true if one is negative and one is positive.
//			For example: 
//			check(3, -7) → true
//			check(-4, 5) → true
//			check(-4, -5) → false
//			check(-12, -2) → false
	
	public boolean negativepositive(int a,int b) {
		if(0 <= a && 0 >= b) {
			return true;
		}else {
			return false;

		}
		
	}
	
//	4. Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
//	For example:
//	or35(3) → true
//	or35(10) → true
//	or35(8) → false

	public boolean multiple(int a) {
		if(a%3 == 0 || a%5 == 0) {
			return true;
		}else {
			return false;

		}
		
	}

	
	
	
//	5. Given two temperatures, return true if one is less than 0 and the other is greater than 100.
//			For example:
//			icyHot(120, -1) → true
//			icyHot(-1, 120) → true
//			icyHot(2, 120) → false
	
	
	public boolean icyHot(int a,int b) {
		if(a<0 && b>100 || b<0 && a>100) {
			return true;

		}else {
			return false;

		}
	}
		
		
	
	
}

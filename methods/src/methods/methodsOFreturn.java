package methods;

public class methodsOFreturn {
	
//	1. WAM to return maximum of 3 numbers.

	public int returnmaximum3(int a,int b,int c) {
		if(a>b) {
			return a;
		}else if(b>c){
			return b;
		}else {
			return c;
		}
	}
	
//	2. WAM to return true if given number is positive else return false.

	public boolean numberpostive(int number) {
		 if(number>0) {
			 return true;
		 }else {
			 return false;
		 }
	
	}
	
//	3. WAM to return "Even" if given number is even else return "Odd".

	public String evenodd(int n) {
		if(n%2 == 0) {
			return "Even";
		}else {
			return "Odd";
		}
	}
	
//	4. WAM to return "Valid" if given number is in between 25 to 35 else return "Invalid".

	public String ValidInvalid(int n) {
		
	if(n<=35 && n>=25) {
		return "Valid";

	}else {
		return "Invalid";
	}
		
	}
	
//	5. WAM to return "Welcome User!" if given String is your name else return "Login Failed!".
	public String login(String name) {
		
		if(name == "Jayesh") {
			return "Welcome User!";

		}else {
			return "Login Failed!";
		}
			
		}
}

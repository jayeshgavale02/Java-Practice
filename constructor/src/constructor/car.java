package constructor;

public class car {
//	String name;
//	int num;
//	public car(){
//		name = "jayesh";
//		System.out.println("non paramterzie "+name);
//	}
//	public car(int a, int b){
//		int num = a+b;
//		System.out.println("paramterzie "+num);
//	}
	
//	
//	int value1; 
//	 int value2; 
//	 
//	 car() { 
//	  value1 = 10; 
//	  value2 = 20; 
//	  System.out.println("Inside 1st Constructor"); 
//	 } 
//	 
//	 car(int a) { 
//	  value1 = a; 
//	  System.out.println("Inside 2nd Constructor"); 
//	 } 
//	 
//	 car(int a, int b) { 
//	  value1 = a; 
//	  value2 = b; 
//	  System.out.println("Inside 3rd Constructor"); 
//	 } 
//	 
//	 public void display() { 
//	  System.out.println("Value1 === " + value1); 
//	  System.out.println("Value2 === " + value2); 
//	 }

	public car() { 
		  System.out.println("Default constructor"); 
		 } 
		 
		 public car(String str) { 
		  this(); 
		  System.out.println("Parametrized constructor with single param"); 
		 } 
		 
		 public car(String str, int num) { 
		  // It will call the constructor with String argument 
		  this("Hello"); 
		  System.out.println("Parametrized constructor with double args"); 
		 } 
		 
		 public car(int num1, int num2, int num3) { 
		  // It will call the constructor with (String, integer) arguments 
		  this("Hello", 2); 
		  System.out.println("Parametrized constructor with three args"); 
		 } 
		 
		  
		 public static void main(String args[]) { 
		  // Creating an object using Constructor with 3 int arguments 
		  car obj = new car(5, 5, 15); 
		 } 
}

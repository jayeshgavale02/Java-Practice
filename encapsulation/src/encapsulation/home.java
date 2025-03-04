package encapsulation;

public class home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		Circle Circleobj =  new Circle();
//		Circleobj.setRadius(7);
//		
//		System.out.println(Circleobj.calculateArea());
//		System.out.println(Circleobj.calculatePerimeter());
//
//		
//		Car CarObj =  new Car();
//		CarObj.setCompany_name("Bajaj");
//		CarObj.setModel_name("Discover");
//		CarObj.setYear(2024);
//		CarObj.setMileage(45);
//		
//		
//		System.out.println(CarObj.getCompany_name());
//		System.out.println(CarObj.getModel_name());
//		System.out.println(CarObj.getYear());
//		System.out.println(CarObj.getMileage());
//
//		
//		NewStudent NewStudentobj =  new NewStudent();
//		NewStudentobj.setStudent_id(1);
//		NewStudentobj.setStudent_name("Jayesh");
//		NewStudentobj.addGrade('A');
//		
//		System.out.println(NewStudentobj.getStudent_id());
//		System.out.println(NewStudentobj.getStudent_name());
//		System.out.println(NewStudentobj.getGrades());
//
//
//		Book Bookobj =  new Book();
//		Bookobj.setTitle("Agni Pamkh");
//		Bookobj.setAuthor("Dr. Apj Abdul Kalam");
//		
//		
//		System.out.println(Bookobj.getTitle());
//		System.out.println(Bookobj.getAuthor());
//		System.out.println(Bookobj.applyDiscount(500));
		
		
		Product Productobj = new Product();
		Productobj.setProductName("milk");
		Productobj.setProductCode(45);
		
		System.out.println(Productobj.getProductName());
		System.out.println(Productobj.getProductCode());
		System.out.println(Productobj.applyDiscount(45));



	}

}

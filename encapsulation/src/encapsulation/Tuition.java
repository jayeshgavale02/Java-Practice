package encapsulation;

public class Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student1 = new Student();
		
		student1.setName("jayesh");
		System.out.println(student1.getName());
		
		student1.setAddress("Dhule");
		System.out.println(student1.getAddress());
		
		student1.setEmail("demo@mail.com");
		System.out.println(student1.getEmail());
		
		student1.setAge(21);
		System.out.println(student1.getAge());
		
		student1.setPhone(7219183128L);
		System.out.println(student1.getPhone());
		
		student1.setGender("male");
		System.out.println(student1.getGender());
		
		System.out.println();
		
        Student student2 = new Student();
        student2.setName("Rahul");
        System.out.println(student2.getName());
        
        student2.setAddress("Mumbai");
        System.out.println(student2.getAddress());

        student2.setEmail("rahul@mail.com");
        System.out.println(student2.getEmail());

        student2.setAge(22);
        System.out.println(student2.getAge());

        student2.setPhone(9876543210L);
        System.out.println(student2.getPhone());

        student2.setGender("Male");
        System.out.println(student2.getGender());

		System.out.println();

		
        Student student3 = new Student();
        student3.setName("Pooja");
        System.out.println(student3.getName());

        student3.setAddress("Pune");
        System.out.println(student3.getAddress());

        student3.setEmail("pooja@mail.com");
        System.out.println(student3.getEmail());

        student3.setAge(20);
        System.out.println(student3.getAddress());

        student3.setPhone(9123456789L);
        System.out.println(student3.getPhone());

        student3.setGender("Female");
        System.out.println(student3.getGender());

		System.out.println();

		
        Student student4 = new Student();
        System.out.println(student4.getName());

        student4.setName("Anjali");
        System.out.println(student4.getName());

        student4.setAddress("Nashik");
        System.out.println(student4.getAddress());

        student4.setEmail("anjali@mail.com");
        System.out.println(student4.getEmail());

        student4.setAge(23);
        System.out.println(student4.getAge());

        student4.setPhone(9988776655L);
        System.out.println(student4.getPhone());

        student4.setGender("Female");
        System.out.println(student4.getGender());

		System.out.println();

        
        Student student5 = new Student();
        student5.setName("Vishal");
        System.out.println(student5.getName());

        student5.setAddress("Nagpur");
        System.out.println(student5.getAddress());

        student5.setEmail("vishal@mail.com");
        System.out.println(student5.getEmail());

        student5.setAge(24);
        System.out.println(student5.getAddress());

        student5.setPhone(8877665544L);
        System.out.println(student5.getPhone());

        student5.setGender("Male");
        System.out.println(student5.getGender());

		
		
		
	}

}

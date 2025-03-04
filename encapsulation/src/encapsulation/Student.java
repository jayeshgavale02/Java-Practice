package encapsulation;

public class Student {

	
	public String name;
	public String address;
	public String email;
	private long phone;
	private int age;
	private String gender;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String add) {
		address = add;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String e) {
		email = e;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long ph) {
		phone = ph;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int ag) {
		age = ag;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gen) {
		gender = gen;
	}
	
	
	
}

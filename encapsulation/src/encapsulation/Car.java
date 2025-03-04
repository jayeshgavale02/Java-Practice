package encapsulation;

public class Car {

	private String company_name; 
	private String model_name;
	private int year;
	private int mileage;
	
	
	

	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String n) {
		company_name = n;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String moden_n) {
		model_name = moden_n;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		year = y;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int m) {
		mileage = m;
	}
}

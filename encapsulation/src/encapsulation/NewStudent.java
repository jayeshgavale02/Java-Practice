package encapsulation;

public class NewStudent {

	private int student_id;
	private String student_name;
	private char grades;
	
	public char addGrade(char g) {
		grades =g;
		return grades;
	}
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int SID) {
		student_id = SID;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String Sname) {
		student_name = Sname;
	}
	public char getGrades() {
		return grades;
	}
	public void setGrades(char g) {
		grades = addGrade(g);
	}
}

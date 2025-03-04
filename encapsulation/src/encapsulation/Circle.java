package encapsulation;

public class Circle {
	private int radius;
	
	
	public float calculateArea() {
		float area = 3.14F*radius;
		return radius;
	}
	
	public float calculatePerimeter() {
		float per = 3.14F*radius*radius;
		return per;
	}


//	public int getRadius() {
//		return radius;
//	}


	public void setRadius(int r) {
		radius = r;
	}

}

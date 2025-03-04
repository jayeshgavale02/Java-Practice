package encapsulation;

public class Book {
	private String title;
	private String author;
	private int price;
	

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String t) {
		title = t;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String a) {
		author = a;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int p) {
		price = applyDiscount(p);
	}
	
	public int applyDiscount(int price) {
		
		int p = 50*price/100;
		
		return p;
	}

}

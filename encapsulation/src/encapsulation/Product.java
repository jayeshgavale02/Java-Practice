package encapsulation;

public class Product {
	private String productName;
	private int productCode;
	private int price;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String pname) {
	productName = pname;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int pcode) {
		productCode = pcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int p) {
		price =applyDiscount(p);
	}
	
    public int applyDiscount(int price) {
		
	int p = 50*price/100;
		
		return p;
	}
    }

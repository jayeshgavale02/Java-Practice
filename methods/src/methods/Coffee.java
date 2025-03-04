package methods;

public class Coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	CoffeeBean CoffeeBeanobj = new CoffeeBean();
		CoffeeBeanobj.brand = "Nescafe";
		CoffeeBeanobj.showBrand();
		
	Sugar Sugarobj = new Sugar();
	Sugarobj.taste = "sweetness";
	Sugarobj.displayTaste();
		
		Milk Milkobj = new Milk();
		Milkobj.quantity =  4;
		Milkobj.tellQuantity();
		
	}

}

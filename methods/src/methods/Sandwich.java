package methods;

public class Sandwich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vegetable Vegetableobj = new Vegetable();
		Vegetableobj.name = "Potato";
		Vegetableobj.showVegetables();

		Vegetableobj.name = "Broccoli";
		Vegetableobj.showVegetables();

		Vegetableobj.name = "Eggplant";
		Vegetableobj.showVegetables();

		Vegetableobj.name = "Bell pepper";
		Vegetableobj.showVegetables();

		
		
		Bread Breadobj = new Bread();
		Breadobj.companyOfBread = "Amul Bread";
		Breadobj.showBreadInfo();
		Breadobj.companyOfBread = "Modern Bread";
		Breadobj.showBreadInfo();
		
		
		Cheese Cheeseobj = new Cheese();
		Cheeseobj.typeOfCheese = "feta";
		Cheeseobj.displayCheeeInfo();
	}

}

package inheritance;

public class home {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		grandpa g = new grandpa();
		g.surname = "Gavale";
	     System.out.println("Grandpa -> Surname: " + g.surname);

		
		father f = new father();
		 f.surname = "Gavale";
		 f.farm = "100 acre";
	     System.out.println("Father -> Surname: " + f.surname + ", Farm: " + f.farm);
		 
		 you y = new you();
		 y.surname = "Gavale";
		 y.farm = "100 acre";
		 y.cycle = "atlsast";
	        System.out.println("You -> Surname: " + y.surname + ", Farm: " + y.farm + ", Cycle: " + y.cycle);

	    
        uncle u = new uncle();
        u.surname = "Gavale";
		 u.farm = "100 acre";
	        System.out.println("Uncle -> Surname: " + u.surname + ", Farm: " + u.farm);

		 cousina a = new cousina();
		 a.surname = "Gavale";
		 a.farm = "200 acre";
		 a.car = "kia";
	       System.out.println("You -> Surname: " + a.surname + ", Farm: " + a.farm + ", Car: " + a.car);

		 
		 cousinb b = new cousinb();
		 b.surname = "Gavale";
		 b.farm = "200 acre";
		 b.bike = "F-Z";
	        System.out.println("Cousin B -> Surname: " + b.surname + ", Farm: " + b.farm + ", Bike: " + b.bike);

		 aunt auntobj =  new aunt();
		 auntobj.surname = "Gavale";
		 auntobj.farm = "100 acre";
	        System.out.println("Aunt -> Surname: " + auntobj.surname + ", Farm: " + auntobj.farm);

		 cousinc c = new cousinc();
		 c.surname = "Gavale";
		 c.farm = "200 acre";
		 c.auto = "APE";
	        System.out.println("Cousin C -> Surname: " + c.surname + ", Farm: " + c.farm + ", Auto: " + c.auto);
	     
	}

}

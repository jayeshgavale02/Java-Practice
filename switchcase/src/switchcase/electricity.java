package switchcase;

public class electricity {
	public static void main(String[] args) {

		int unit = 50;
		double bill;
		double result;
		if(unit <= 50) {
			bill = 0.50*unit;
           
		}else if(unit <= 150) {
			bill = 0.75*unit;
		}else if(unit <= 250) {
			bill = 1.20*unit;

		}else {
			bill = 1.50*unit;
		}
        result = bill/100*20;
        
        switch(unit) {
        case 300:
            System.out.println(unit+ "  "+bill + "   "+result);
          break;
        
        }
        
	}
	
}

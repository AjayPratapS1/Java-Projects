package javap;

public class Recipt_Gen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer recipts= new StringBuffer();
        recipts.append("Ajay Recipts:");
        recipts.insert(13, "\n");
        recipts.append("1. Coffee - 100\n");
        recipts.append("2. Tea - 120\n");
        recipts.append("Total - 220\n");
        recipts.append("Thanks for shopping...");
        
        
        System.out.println(recipts.toString());
        
        //replace
        System.out.println(recipts.replace(0, 10, "AjAY"));
        
	}

}

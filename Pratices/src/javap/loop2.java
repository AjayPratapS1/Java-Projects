package javap;

public class loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] guests = {"Ajay", "Ravi", "Sneha"};
		String name = "Ravi";
		boolean found = false;
		for(String guest : guests) {
		    if(guest.equals(name)) {
		        found = true;
		        break;
		    }
		}
		System.out.println(found ? "Guest is invited." : "Not on guest list.");

	}

}

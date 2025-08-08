package javap;
import java.util.Scanner;
public class JaggedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Declare a jagged array
//        int[][] jagged = new int[3][];
//        
        // Initialize each row with different lengths
//        jagged[0] = new int[2]; // Row 0 has 2 columns
//        jagged[1] = new int[3]; // Row 1 has 3 columns
//        jagged[2] = new int[1]; // Row 2 has 1 column

        // Assign values
//        jagged[0][0] = 10;
//        jagged[0][1] = 20;
//        jagged[1][0] = 30;
//        jagged[1][1] = 40;
//        jagged[1][2] = 50;
//        jagged[2][0] = 60;

        // Print jagged array
//        for (int i = 0; i < jagged.length; i++) {
//            for (int j = 0; j < jagged[i].length; j++) {
//                System.out.print(jagged[i][j] + " ");
//            }
//            System.out.println();
//        }
		Scanner s = new Scanner(System.in);
		String[][] employee = new String[3][];
		employee[0] = new String[3];
		employee[1] = new String[2];
		employee[2] = new String[1];
		System.out.println("Assing Project to employee");
		for(int i = 0; i < employee.length;i++) {
			System.out.println(i+1 + " Employee Project Assignment: ");
			for(int j = 0; j < employee[i].length; j++) {
				employee[i][j] = s.nextLine();
			}
		}
		System.out.println("Assinged Project to employee:");
		for(int i = 0; i < employee.length;i++) {
			System.out.println(i+1 + " Employee Project Assignment is: ");
			for(int j = 0; j < employee[i].length; j++) {
				System.out.print(employee[i][j] + " ");
			}
			System.out.println();
		}
		
       s.close();
	}

}

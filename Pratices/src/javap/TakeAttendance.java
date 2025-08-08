package javap;

import java.util.Scanner;

public class TakeAttendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[][] student = { { "Rohit", "0" }, { "Ajay", "0" }, { "Jai", "0" } };

		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				if (j == 0) {
					System.out.println("Mark the attendance of " + student[i][j] + ":");
				} else {
					student[i][j] = s.nextLine();
				}
			}
		}
		System.out.println("The final Mark attendance: ");
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				System.out.print(student[i][j] + " ");
			}
			System.out.println();
		}
		s.close();
	}
	

}

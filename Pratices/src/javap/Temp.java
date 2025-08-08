package javap;

public class Temp {

	public static void main(String[] args) {
//		Monitor Patient's Temperature Every Hour
		String patientA = "Jai";
		int temp = 23;
		for (int i = 0; i < 24; i++) {
			if (i == 0) {
				System.out.println("The initial temp of " + patientA + " is " + (temp + i) + " degree");
			} else {
				System.out.println("After one hour temp of " + patientA + " is " + (temp + i + 1) + " degree");
			}

		}

	}

}

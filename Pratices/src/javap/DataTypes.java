package javap;

public class DataTypes {

	public static void main(String[] args) {
		// 1. Primitive Data Types
		byte age = 23; // 1 byte
		short year = 2025; // 2 bytes
		int salary = 50000; // 4 bytes
		long population = 7800000000L; // 8 bytes (Note the 'L')

		float pi = 3.14f; // 4 bytes (Note the 'f')
		double gpa = 8.72; // 8 bytes

		char grade = 'A'; // 2 bytes (Unicode character)
		boolean isPassed = true; // 1 bit (logical)

		// 2. Non-primitive Data Type
		String name = "Ajay Pratap Singh";

		// Output all data
		System.out.println("Name: " + name);
		System.out.println("Age (byte): " + age);
		System.out.println("Year (short): " + year);
		System.out.println("Salary (int): ₹" + salary);
		System.out.println("Population (long): " + population);
		System.out.println("Pi Value (float): " + pi);
		System.out.println("GPA (double): " + gpa);
		System.out.println("Grade (char): " + grade);
		System.out.println("Passed Exam (boolean): " + isPassed);

	}

}

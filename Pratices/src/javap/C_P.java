package javap;

public class C_P {
//	Perform deposit and withdraw operations.
//	Store and display employee details.
//	Add and display book details.
//	Upload and download file info like in Google Drive
//	Simulate a chatbot that responds to user messages.
	int employeeId = 1;
	String employeeName = "Ajay Pratap Singh";
	String position = "Software Engineer";
	int salary = 50000;
	String company = "Wipro";

	void DisplayInfo() {
		System.out.println("===== Employee Details =====");
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Position: " + position);
		System.out.println("Salary: " + salary);
		System.out.println("Company: " + company);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_P obj = new C_P();
		obj.DisplayInfo();
	}

}

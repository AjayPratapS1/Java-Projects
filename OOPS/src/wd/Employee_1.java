package wd;

public class Employee_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e = new Employee1();
		e.setFirstName("Ajay", "Singh");
		e.work();
		
		
		Manager m = new Manager();
		m.setFirstName("Harsh", "Singh");
		m.work();
		m.manage();
		
		Developer d = new Developer();
		d.setFirstName("Jai", "Singh");
		d.work();
		d.code();		

	}

}

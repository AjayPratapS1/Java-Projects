package staticMethod;

public class ExplicitConst {
	private int a;
	private int b;
	ExplicitConst(int a, int b){
		this.a = a;
		this.b = b;
	}
	 // Copy constructor and also overloading of constructor
	ExplicitConst(ExplicitConst s) {
        this.a = s.a;
        this.b = s.b;
    }
	void displaySum() {
		int sum = a+b;
		System.out.println("The sum is: " + sum );
		
	}
	public static void main(String[] args) {
		//Explicit constructor
	   ExplicitConst e = new ExplicitConst(5,6);
	   e.displaySum();
	   
	   //copy constructor
	   ExplicitConst e1 = new ExplicitConst(e);
	   e.displaySum();

	}

}

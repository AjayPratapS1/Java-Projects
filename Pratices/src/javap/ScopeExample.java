package javap;
public class ScopeExample {
	// Static variable (class-level, shared across all objects)
	static int staticVar = 10;

	// Instance variable (belongs to each object)
	int instanceVar = 20;

	public static void main(String[] args) {
		// Local variable (only within this method)
		int localVar = 30;

		// Create an object to access instance variable
		ScopeExample obj = new ScopeExample();

		System.out.println("Static Variable: " + staticVar);
		System.out.println("Instance Variable: " + obj.instanceVar);
		System.out.println("Local Variable: " + localVar);
	}
}
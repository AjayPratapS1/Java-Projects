package javap;

public class PasswordStrength {

	public static void main(String[] args) {
		String password = "pass123";

		if (password.length() >= 8)
			System.out.println("Strong Password");
		else
			System.out.println("Weak Password");

	}

}

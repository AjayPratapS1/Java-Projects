package javap;

public class MaxOfThree {

	public static void main(String[] args) {
		int a = 5, b = 9, c = 7;
		int max;
		if (a > b && a > c)
			max = a;
		else if (b > c)
			max = b;
		else
			max = c;
		System.out.println("Maximum is: " + max);

	}

}

package javap;

public class loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] temps = {36.5, 37.2, 38.0, 36.8};
		double sum = 0;
		for(double t : temps) {
		    sum += t;
		}
		System.out.println("Average temp: " + sum / temps.length);

	}

}

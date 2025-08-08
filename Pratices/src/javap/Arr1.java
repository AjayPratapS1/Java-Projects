package javap;

public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []arr1;
//		arr1 = new int[5];
		
		int [] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum+= arr[i];
		}
		System.out.println("Sum of the array numbers: "+ sum);

	}

}

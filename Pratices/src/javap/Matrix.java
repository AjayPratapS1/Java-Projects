package javap;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Define the size of the 2D array
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();

		// Declare 2D array
		int[][] arr = new int[rows][cols];

		// Input values
		System.out.println("Enter elements of the array:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Element at [" + i + "][" + j + "]: ");
				arr[i][j] = sc.nextInt();
			}
		}

		// Output values
		System.out.println("The 2D array is:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}

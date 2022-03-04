package Arrays;

import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {

		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matrix Array");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + "  ");

			}
			System.out.println("\n");

		}
	}

}

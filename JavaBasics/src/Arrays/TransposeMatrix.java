package Arrays;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {

		int a[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Transpose matrix ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.print("\n");
		}
	}

}

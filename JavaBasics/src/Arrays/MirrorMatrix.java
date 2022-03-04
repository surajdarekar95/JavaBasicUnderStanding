package Arrays;

import java.util.Scanner;

public class MirrorMatrix {

	public static void main(String[] args) {

		int a[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array Elements");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Mirror Matrix");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = a.length - 1; j >= 0; j--) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}

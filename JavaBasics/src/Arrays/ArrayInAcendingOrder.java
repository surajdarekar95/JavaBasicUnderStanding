package Arrays;

import java.util.Scanner;

public class ArrayInAcendingOrder {

	public static void main(String[] args) {

		int temp;
		int as[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");

		for (int i = 0; i < as.length; i++) {
			as[i] = sc.nextInt();
		}

		for (int i = 0; i < as.length; i++) {

			for (int j = i+1; j < as.length; j++) {
				if (as[i] > as[j]) {
					temp = as[i];
					as[i] = as[j];
					as[j] = temp;
				}
			}
		}
		System.out.println("After Arranging");

		for (int i = 0; i < as.length; i++) {
			System.out.println( as[i]);
		}

	}

}

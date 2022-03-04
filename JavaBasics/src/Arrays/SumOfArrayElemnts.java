package Arrays;

import java.util.Scanner;

public class SumOfArrayElemnts {

	public static void main(String[] args) {

		int sum = 0;
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements :");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			sum = a[i] + sum;
		}
		System.out.println("Sum Of Array Elemens = " + sum);
	}

}

package Arrays;

import java.util.Scanner;

public class FindMinNumberInAraay {

	public static void main(String[] args) {

		int min;
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("Smallest Number in Array = " + min);
	}

}

package Arrays;

import java.util.Scanner;

public class AverageOfArrayElemnts {

	public static void main(String[] args) {

		int sum = 0;
		double Average;
		int avg[] = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements");

		for (int i = 0; i < avg.length; i++) {
			avg[i] = sc.nextInt();
		}

		for (int i = 0; i < avg.length; i++) {
			sum = avg[i] + sum;
		}

		Average = sum / 5.0;
		System.out.println("\nAddintion = " + sum + "\n\nAverage = " + Average);
	}

}

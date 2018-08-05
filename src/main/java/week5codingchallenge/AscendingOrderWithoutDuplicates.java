package week5codingchallenge;

import java.util.Scanner;

public class AscendingOrderWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, temp;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = obj.nextInt();

		int arr[] = new int[num];
		System.out.println("Enter the Number one by one");
		for (int i = 0; i < num; i++) {
			arr[i] = obj.nextInt();
		}

		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}

		System.out.println("Sorting : ");
		for (int i = 0; i < num; i++) {
			if (arr[i] != num - 2) {
				if (arr[i] == arr[i + 1]) {
					for (int j = i; j < num - 2; j++)
						arr[i] = arr[i + 1];
				}

			}

		}
		System.out.println("After removing duplicates");
		for (int i = 0; i < num - 2; i++) {
			System.out.println(" " + arr[i]);
		}
	}

}

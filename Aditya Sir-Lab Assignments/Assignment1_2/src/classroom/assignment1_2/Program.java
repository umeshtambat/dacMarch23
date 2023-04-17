package classroom.assignment1_2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class Test {
	Scanner scanner = new Scanner(System.in);

	void acceptArrayElements(int[] arr) throws InputMismatchException {

		System.out.print("Enter Array Elements	:	");
		for (int i = 0; i < arr.length; i++)

			arr[i] = scanner.nextInt();

	}

	void displayArrayElements(int[] arr) {

		System.out.print("Entered Array Elements	:	");
		// for (int i = 0; i < arr.length; i++)
		// System.out.print(arr[i] + " ");
		System.out.println(Arrays.toString(arr));

	}

	public void sumArrayElements(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println();
		System.out.println("sum of Array Elements	:	" + sum);

	}

}

public class Program {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int[] arr = null;
		Test test;
		while (true) {

			System.out.print("Enter Array Size	:	");
			int size = scanner.nextInt();
			if (size > 0) {
				arr = new int[size];
				try {
					test = new Test();
					test.acceptArrayElements(arr);
					test.displayArrayElements(arr);
					test.sumArrayElements(arr);
				} catch (InputMismatchException e) {

					e.printStackTrace();
				} finally {
					test = null;
				}

			} else

				System.out.println("Array size should be positive!!");
		}

	}

}

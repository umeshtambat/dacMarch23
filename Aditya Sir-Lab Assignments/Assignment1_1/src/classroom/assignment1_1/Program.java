package classroom.assignment1_1;

import java.util.Scanner;

class Swap {
	static Scanner scanner = new Scanner(System.in);
	private static int num1;
	private static int num2;

	public static void swap() {
		Swap.num2 = num1 + num2; // 15 (5,10)
		Swap.num1 = num2 - num1; // 15-5=10
		Swap.num2 = num2 - num1;
		System.out.println("After Swapping");
		System.out.println("num1	:	" + Swap.num1);
		System.out.print("num2	:	" + Swap.num2);
	}

	public static void acceptNumbers() {
		System.out.println("Enter Two Numbers");
		System.out.print("num1	:	");
		Swap.num1 = scanner.nextInt();
		System.out.print("num2	:	");
		Swap.num2 = scanner.nextInt();

	}

}

public class Program {
	public static void main(String[] args) {

		Swap.acceptNumbers();
		Swap.swap();

	}

}

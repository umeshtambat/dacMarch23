package classroom.assignment1_3;

import java.util.Scanner;

class Test {

	public static String reverseString(String string) {
		String str = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			str += String.valueOf(string.charAt(i));
		}

		return str;

	}
}

public class Program {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.print("Enter String	:	");
				String string = scanner.nextLine();
				if (string.matches("[a-zA-Z\\s]+")) {
					System.out.println(Test.reverseString(string));

				} else {
					System.out.println("Invalid String!! Please Re-enter");
				}

			}
		}
	}
}

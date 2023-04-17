package classroom.assignment1_4;

import java.util.Scanner;

class Test {

	public static boolean palindromeCheck(String string) {
		String str = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			str += String.valueOf(string.charAt(i));
		}
		if (str.equals(string))
			return true;
		return false;

	}
}

public class Program {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.print("Enter String	:	");
				String string = scanner.nextLine();
				if (string.matches("[a-zA-Z\\s]+")) {
					System.out.println((Test.palindromeCheck(string)) ? "Palindrome" : "Not a Palindrome");

				} else {
					System.out.println("Invalid String!! Please Re-enter");
				}

			}
		}
	}
}

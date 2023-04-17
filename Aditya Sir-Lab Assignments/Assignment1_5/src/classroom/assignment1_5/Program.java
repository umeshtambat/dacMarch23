package classroom.assignment1_5;

import java.util.Scanner;

class Test {

	public static void stringCount(String string) {

		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (String.valueOf(string.charAt(i)).equals(" ") || i == string.length() - 1) {
				count++;
			}

		}
		System.out.println("The sentence contains "+count+ " words");

	}
}

public class Program {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.print("Enter String	:	");
				String string = scanner.nextLine();
				if (string.matches("[a-zA-Z\\s]+")) {
					Test.stringCount(string);
				} else {
					System.out.println("Invalid String!! Please Re-enter");
				}

			}
		}
	}
}

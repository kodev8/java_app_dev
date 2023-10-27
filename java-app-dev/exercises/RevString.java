package exercises;


import java.util.Scanner;

public class RevString {
	
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your first word: ");
		String first_text = scanner.next();

		System.out.print("Enter your second word: ");
		String second_text = scanner.next();

		scanner.close();

		int c = second_text.length() - 1;
		for(; c >= 0; c--) {
			System.out.print(second_text.charAt(c));
		}

		System.out.print(" " + first_text);
	}
}

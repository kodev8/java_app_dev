package exercises;

import java.util.Scanner;

public class RevString {
	
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any word: ");
		String text = scanner.nextLine();
		
		int c = text.length() - 1;
		for(; c >= 0; c--) {
			System.out.print(text.charAt(c));
		}
		
		scanner.close();
	}
}

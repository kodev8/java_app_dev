package exercises;

import java.util.Scanner;

public class MixedCase {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter any word: ");
		String text = scanner.nextLine();
	
		char[] text_arr = text.toCharArray();
				 
		for(char letter : text_arr) {
			
			if(letter >= 'A' && letter <= 'Z') {
				System.out.print((letter+"").toLowerCase());
			}else if(letter >= 'a' && letter <= 'z'){
				System.out.print((letter+"").toUpperCase());
			}else {
				
				System.out.print(letter);
			}
			
		}
		scanner.close();
	}
}

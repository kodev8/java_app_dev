package exercises;
import java.util.Scanner;

// concatenate punctuation on new line
public class FormatStringCPNL {
	


	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your text: ");
		String text = scanner.nextLine();
//		as defined by requirements
		String punctuation = ";:.,";
		
		for(int c = 0; c < text.length(); c++) {
			
			char temp = text.charAt(c);

			if(Character.isAlphabetic(temp)) {
				System.out.print(temp);
			}else if(temp != ' ' && punctuation.indexOf(temp) != 1) {
				System.out.println();
			}
			
		}
		scanner.close();
	}
}




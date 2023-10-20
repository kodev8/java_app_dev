package exercises;
import java.util.Scanner;

public class NamePyramid {

	private static void spaces(int repeat) {
		for(int i=0; i < repeat; i++) {
			System.out.print(" ");
		}
	}
	
	private static void spacedName(String name_row) {
		for(int j=0; j < name_row.length(); j++ ) {
			System.out.print(name_row.charAt(j));
            System.out.print(" ");
            
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.next();
		
		for(int i=1; i <= name.length(); i++) {
			
			spaces(name.length() - i);
			String name_row = name.substring(0,i);
			spacedName(name_row);
			System.out.println();
		}
		
		scanner.close();

	}

}

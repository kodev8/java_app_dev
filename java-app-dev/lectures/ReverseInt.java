package lectures;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		int number = scanner.nextInt();
		scanner.close();
		
		int store = 0;
		
//		while(number > 0) {
//			int last_digit = number % 10;
//			store = store * 10 + last_digit;
//			number /=10;
//		}
		
		for(; number > 0; number/=10) {
			int last_digit = number % 10;
			store = store * 10 + last_digit;
		}
		
		System.out.println(store);

	}

}

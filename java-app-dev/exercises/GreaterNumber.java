package exercises;
import java.util.Scanner;

public class GreaterNumber {

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
//			note: print instead of println to keep input on the same line
			System.out.print("Enter your first number: ");
			float num1 = scanner.nextFloat();
			
			System.out.print("Enter your second number: ");
			float num2 = scanner.nextFloat();
			
//			nested ternary to avoid if as per requirements
			float res = num1 > num2 ? num1 : (num1 == num2 ? Float.NaN : num2);
			String statement = Float.isNaN(res) ? "The numbers are equal" : "The larger number is " + res;
			
			System.out.println(statement);
		}catch (Exception e) {
			System.out.println("Unable to display larger number: " + e);
		} finally {
			scanner.close();
		}
	
		
	}

}

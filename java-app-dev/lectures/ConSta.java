package lectures;

import java.util.Scanner;

// Conditional Statements
public class ConSta {

	private Scanner scanner = new Scanner(System.in);
	private int age;

	public void isVoteEligible() {

		try {
			
			System.out.println("Checking vote eligibility!");
			System.out.print("Enter your age: ");
			age = scanner.nextInt();
			if (age >= 18) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not Eligible");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getDayName() {

		System.out.print("Enter day of the week as an int: ");
		int day = scanner.nextInt();

		switch (day) {

		case 1:
			return "Sunday";
			
		case 2:
			return "Monday";
			
		case 3:
			return "Tuesday";
			
		case 4:
			return "Wednesday";
			
		case 5:
			return "Thursday";
			
		case 6:
			return "Friday";
			
		case 7:
			return "Sunday";
		
		default:
			return "Invalid input.. Try 1,2,3,4,5,6 or 7";

		}

	}

}

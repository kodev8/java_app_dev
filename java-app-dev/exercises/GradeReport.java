package exercises;
import java.util.Scanner;
// Exercise 3
public class GradeReport {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a subject: ");
		String subject = scanner.nextLine();
		subject = subject.toLowerCase();
		String[] subject_words = subject.split(" ");
		StringBuilder final_subject_array = new StringBuilder();
		
		for (String word : subject_words) {
		    final_subject_array.append(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
		}

		String final_subject = final_subject_array.toString().trim();
		
		System.out.print("Enter a Valid grade: ");
		String grade = scanner.nextLine();
		grade = grade.toUpperCase();
		
		String res;
		switch (grade){
			case "A":
				res="Excellent";
				break;
			case "B":
				res="Good";
				break;
			case "C":
				res="Okay";
				break;
			case "D":
				res="Bad, Try harder";
				break;
			case "E":
				res="Really Bad, Try harder";
				break;
			case "F":
				res="Horrible, Try harder";
				break;
			default:
				res = "Invalid grade!";
		
		}
		
		System.out.println(final_subject);
		System.out.println(res);
		scanner.close();
	}

}

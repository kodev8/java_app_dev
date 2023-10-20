package exercises;
import java.util.Scanner;

public class EvenNumbers {
	
	
	public void showEvenNumbers(boolean useMod) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter your number: ");
			int num = scanner.nextInt();
			int start = 0;
			
			if (useMod) {
				for(; start < num; start ++) {
					if (start%2==0) {
						System.out.println(start);
					}
				}
			}else {
				for(; start < num; start += 2) {	
					System.out.println(start);
				}
			}
			
			System.out.println("End" + (useMod ? "(mod)" : ""));
			
		}catch (Exception e) {
			System.out.println("unable to show even numbers" + (useMod ? "(mod)" : ""));
			e.printStackTrace();
		}finally {
			scanner.close();
		}
		
	}
	
	
	public static void main(String[] args) {
		// Exercise #1
		EvenNumbers en = new EvenNumbers();
		boolean useMod = true;
		en.showEvenNumbers(useMod);
	}
	
}

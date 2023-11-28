package ex1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class EvenOdd {
    
    public static void main(String[] args) {

        // initialise scanner
        Scanner scanner = new Scanner(System.in);

        // ask user for the size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // initialise array list to store all the user input elements and ask the user for it
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter the elements of the array: ");

        // loop through the array list and add the user input elements to it
        while (arr.size() < size) {
            arr.add(scanner.nextInt());
        }

        scanner.close();

        // create array stores for even and odd numbers
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        Collections.sort(arr);

        // loop through the array list and add the even and odd numbers to their respective array lists
        for (int i = 0; i < arr.size(); i++) {

            int item = arr.get(i);
            if (item % 2 == 0) {
                evens.add(item);
            }
            else
                odds.add(item);
        }

        
        // print the even and odd numbers
        System.out.println("The even numbers are: " + evens);
        System.out.println("The odd numbers are: " + odds);
        System.out.print("The numbers divisible by 3 and 5 are: ");

        // loop through even list first to display those divisble by 3 or 5
        for (Integer i : evens) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        // then loop through odd list to display those divisble by 3 or 5
        for (Integer i : odds) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

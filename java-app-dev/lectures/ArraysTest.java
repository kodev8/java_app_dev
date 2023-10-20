package lectures;
import java.util.Scanner;
import java.util.HashSet;

public class ArraysTest {
	
	public void arrayTest(int method) {
		Scanner scanner = new Scanner(System.in);
//		declare type as array the new type [size of array] e.g int[] varName = int[10] creates array of fixed size
		
		switch (method) {
		case 1: 
		
			int size1 = 3;
			int[] intArray1 = new int[size1];
//			testing 1
			intArray1[0] = 12;
			intArray1[1] = 20;
			intArray1[2] = 4;
			System.out.println("Test 1: ");
			for (int i = 0; i < size1; i++) {
				System.out.println(intArray1[i]);
			}
			break;
			
		case 2:
		
//			Create array  note: (kind of like set notation in python) note that arrays here can be indexed
			int[] intArray2 = {1,2,3,4,5,6,7,8}; // capacity is also fixed here
			System.out.println("Test 2:");
			for (int i = 0; i < intArray2.length ; i++) {
				System.out.println(intArray2[i]);
			}
			break;
			
		case 3:
		
//			test 3: Let user determine size and ask for array elements
			System.out.print("Enter array size: ");
			int size3 = scanner.nextInt();
			int[] intArrayFromUser = new int[size3];
	
			System.out.println("Enter the values for the array: ");
			for (int i = 0; i < size3; i++) { // iterate for exact size
				intArrayFromUser[i] = scanner.nextInt();
			}
			
			System.out.println();
			System.out.println("Showing vals: ");
			for (int i = 0; i < size3; i++) {
				System.out.println(intArrayFromUser[i]);
			}
			break;
			
		
		
		default:
			System.out.println("enter 1, 2 or 3");
		}
		
		scanner.close();

	}
	
	public void stringArray() {
		
//		Create a string array also
		System.out.println("String Array:");

		String[] stringArray = new String[10]; 
//		note: does not have to be in order because empty array is created of all null vals
		stringArray[0] = "Java lec";
		stringArray[2] = "Java new";
		
		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]); // return null
		System.out.println(stringArray[2]);
	}
	
	public void showCommonArrayElements() {
		int[] l1 = {1,3,5,6,7};
		int[] l2 = {3, 6};
		
		System.out.println("Common in l1 and l2 are: ");
		for(int i = 0; i < l1.length; i++) {
			for(int j = 0; j < l2.length; j++) {
				if (l1[i] == l2[j]) {
					System.out.println(l1[i]);
				}
			}
		}
	}
	
	public void showCommonStringArrayElements() {
	   String[] premTeams = {"Man Utd", "Man City", "Everton", "Bunley", 
			   				"Arsenal", "Sheffield Utd", "Newcastle Utd"};
	    
	   String[] clTeams = {"Arsenal", "Barcelona", "Real Madrid", 
			   				"Man Utd", "Bayern Munich", "MAN CITY", "Galatasaray", "newCastle utD"};
	       
       HashSet<String> premCLTeams = new HashSet<String>();
 
        for (int i = 0; i < premTeams.length; i++){
            for (int j = 0; j < clTeams.length; j++){
               if(premTeams[i].toLowerCase().equals(clTeams[j].toLowerCase())){
                    premCLTeams.add(premTeams[i]);
                }
            }
        }
	 
	        System.out.println("Teams in Premier League and Champions League : " + (premCLTeams)); 
	    }
}

package lectures;

import java.io.*;

import java.util.Scanner;

public class Files {
	
	private static String makePath(String name) {
		return  "C:\\Users\\kalev\\Downloads\\test-" + name +".txt";
	}
	
	//	push checked exceptions up the stack
	public static void createFiles () throws IOException {
		String path = makePath("1");
		File fileObj = new File(path);
		try {
			if (fileObj.createNewFile()) {
				System.out.println("Making new file: " + path);
			}else {
				System.out.println("This file " + path + " already exists...");
			}
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
//		method 1 to write to file - reg
		FileWriter fileWriter = new FileWriter(makePath("2"));
		fileWriter.write("First Line" + "\n");
		fileWriter.append("Some text");
		fileWriter.close();
		System.out.println("Completed method 1");
		
//		method 2 - with buffer
		Scanner scanner = new Scanner(System.in);
		FileWriter fileWriter2 = new FileWriter(makePath("3"));
		String fileData = "";
		BufferedWriter buffer = null;
		
		System.out.println("Enter the file content: ");
		buffer = new BufferedWriter(fileWriter2);
		
		while (true) {
			fileData=scanner.nextLine();
			if (fileData.contentEquals("/")) break;
			buffer.write(fileData, 0, fileData.length());
			buffer.newLine();
		}
	
		buffer.close();
		scanner.close();
		System.out.println("Completed method 2");
	
	}
	
	
	public static void readFile () throws IOException{
		
		String path = makePath("3");
		char[] array = new char[100];
		FileReader readFile = new FileReader(path);

		readFile.read(array);
		System.out.println("Content of the following file: " + path);
		System.out.println(array);
		readFile.close();
		
	}
	
	
	public static void deleteFile() throws IOException {
		
		String path = makePath("3");
		File fileToDelete = new File(path);

		boolean deleted = fileToDelete.delete();
		if (deleted) {
			System.out.println(path + " has been deleted");
		} else {
			System.out.println(path + " was not deleted");
		}
		
	}
	
	

}

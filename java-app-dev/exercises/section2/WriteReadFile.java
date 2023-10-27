package exercises.section2;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;

import java.util.Scanner;

public class WriteReadFile {
    public static void main (String args[]) throws IOException {

        String file_path = "inthisdir.txt";
        
        File file = new File(file_path);

        if (file.createNewFile()) {
            System.out.println("File Created!");
        }else {
            System.out.println("File already exists.");
        };

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter your text: ");
            String text = scanner.nextLine();
            
            // note: contentEquals does not check if if the object is also is a string; 
            // equals checks both 
            if(text.equals("/")) break;
            
            writer.write(text, 0, text.length());
            writer.newLine();
            
        }

        writer.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        String content;
        while((content = reader.readLine()) != null) {
            System.out.println(content);

        }

        reader.close();
        scanner.close();


    }
}

package exercises.section2;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;



public class CanReadOffset {

   public static void main (String args[]) throws IOException {

      String file_path = "C:\\Users\\kalev\\Downloads\\demo.txt";
      File file = new File(file_path);
      if (file.canRead()) {
         System.out.println("This file can read!");
       }else {
         System.out.println("Cannot read this file");
         return;
       }

      FileReader fileReader = new FileReader(file);
      fileReader.skip(35); // hard coded value for the start of targeted text
      BufferedReader reader = new BufferedReader(fileReader);
      
      
      fileReader.close();
      reader.close();
 
   };
}

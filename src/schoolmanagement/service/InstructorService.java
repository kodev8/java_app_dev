package schoolmanagement.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import schoolmanagement.models.Instructor;

public class InstructorService {

	public List<Instructor> readCSV () throws IOException{
		String line = null;
		int count = 0;

        FileReader fileReader = new FileReader("C:\\Users\\kalev\\Downloads\\instructors.csv");
		BufferedReader bufferedReader = new BufferedReader(fileReader) ;
		List<Instructor> instructorList = new ArrayList<>();
		
		while((line = bufferedReader.readLine()) != null){
			if(count != 0) {
				Instructor instructor = new Instructor();
				String[] instructors = line.split(",");
				
				instructor.setInstructorId(instructors[0].trim());
				instructor.setName(instructors[1].trim());
				instructor.setSubject(instructors[2].trim());
				String subject = instructors[2].trim();
				if(subject.equals("C++")) {
					instructor.setSubject("JavaScript");
				}
				instructor.setPhoneNumber(new BigInteger(instructors[3].trim()));
				instructor.setEmail(instructors[4].trim());
				instructor.setTargetYear(instructors[5].trim());
				
				instructorList.add(instructor);
				
			}
			count++;
		}
		
		bufferedReader.close();
		return instructorList;
		
	}

    public static void main(String[] args) {
        InstructorService instructorService = new InstructorService();
        
        try {
            List<Instructor> instructors = instructorService.readCSV();
            for ( Instructor ins : instructors) {
                System.out.println(ins);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 

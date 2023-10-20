package schoolmanagement.service;


import java.util.ArrayList;
import java.util.Arrays;

import schoolmanagement.models.Student;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class PaymentService {
	
	public ArrayList<Student> read() throws IOException{
		
		String line = null;
		String splitBy = ",";
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kalev\\Downloads\\students.csv"));
		ArrayList<Student> studentList = new ArrayList<>();
		
		int count = 0;
//		csv format: 0: ID, 1: Name, 2: Department, 3: Courses, 4: Age, 5: Year, 6: Fee, 7: Paid 
		while((line = br.readLine()) != null) {
			
			// skip table header
			if(count != 0) {
				
				String[] students = line.split(splitBy);
				
				Student student = new Student();
				String age = students[4].trim();
				
				if (age != "") {
					age = (Integer.valueOf(students[4].trim()) >= 19) ? students[4].trim(): String.valueOf(0);
				}
			
				student.setStudentId(students[0].trim());
				student.setName(students[1].trim());
				student.setDepartment(students[2].trim());

//				split courses by semi-colon
				String coursesJoined = students[3].trim();
				String[] courses = coursesJoined.split(";");
				
//				as List to maintain type
				student.setCourses(Arrays.asList(courses));
				student.setAge(students[4].trim());
				student.setYear(students[5].trim());
			
				double fee = Double.parseDouble(students[6].trim());
				student.setFee(fee);
				student.setPaid(students[7].trim());
			
				if(students[7].trim() != null && !students[7].trim().isEmpty()) {
					student.setPaid(students[7].trim());
				}
				
				
//				System.out.println(student);
				studentList.add(student);			
			}
			count ++;
			
		}
		
		br.close();
		return studentList;
	}

}

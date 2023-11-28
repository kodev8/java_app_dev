package schoolmanagement.service;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList; 
import java.util.Arrays;
import schoolmanagement.models.Student;


public class TestService {

    public ArrayList<Student> readCSV() throws IOException {
        // StudentId	Name	Department	Course	Age	Year Fee Paid

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kalev\\OneDrive - EPITA\\Semester 3\\Java\\Exercises\\Mid Exam\\students.csv"));
        
        String line; 
        int count = 0;

        ArrayList<Student> studentList = new ArrayList<>(); 

        while ((line=br.readLine()) != null) {

            if (count == 0) {
                count++;
                continue;
            }
            
            String[] data = line.split(",", -1);
            Student student = new Student();

            student.setStudentId(data[0].trim());
            student.setName(data[1].trim());
            student.setDepartment(data[2].trim());

            String[] courses = data[3].trim().split(";");
            student.setCourses(Arrays.asList(courses));

            student.setAge(data[4].trim());
            student.setYear(data[5].trim());

            Double fee = Double.parseDouble(data[6].trim());
            student.setFee(fee);

            student.setPaid(data[7].trim());
            
            studentList.add(student);

        }

        br.close();


        return studentList;


    }
};
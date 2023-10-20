package schoolmanagement.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

import java.io.IOException;
import java.text.ParseException;

import schoolmanagement.models.Admin;
import schoolmanagement.models.Course;
import schoolmanagement.models.Enrollment;
import schoolmanagement.models.Student;
import schoolmanagement.service.PaymentService;


public class Main {
	
//	Checked Exceptions 
	public static void main(String[] args) throws ParseException, IOException {

//		create a new admin
		Admin admin = new Admin();
		admin.setAdminId("A123");
		admin.setPassword("EpitaJavaDev");

//		create some courses new course
		Course course = new Course();
		course.setCourseId("C123");
		course.setCourseDuration(40);
		course.setCourseName("Python For Web Development");

//		create new Student
		Student student = new Student();
		student.setStudentId("S123");
		student.setName("Test");
		student.setAge("18");
		student.setDepartment("Bachelor's of Computer Science");
		student.setYear("2023");
		
//		create intake
		SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");
		Enrollment enroll = new Enrollment();
		enroll.setEnrollId(192020231);
		enroll.setDate(date_format.parse("01/09/2023"));
		enroll.setDetails("Fall 2023 enrollment");

//		create arrayList of courses for student
		ArrayList<String> courses = new ArrayList<>(Arrays.asList("Python", "French", "C", "PHP"));
		
//		add courses to the student
		student.setCourses(courses);

		
		try { 
			PaymentService paymentService = new PaymentService();
			ArrayList<Student> students = paymentService.read();
			students.add(student);
			Collections.sort(students, new Student.Sorter());
			System.out.println("Sorted Students: ");
			System.out.println();
			students.forEach(System.out::println);
		}
		catch (Exception e) {
			System.out.println("Payment Service encountered an error: " + e.getMessage());
		}
		
		
		
	}

}

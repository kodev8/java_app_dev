package schoolmanagement.models;

import java.util.List;

import java.util.Comparator;

public class Student {

	private String studentId;
	private String name;
	private String age;
	private List<String> courses;
	private String department;
	private String year;
	private double fee;
	private String paid;

	public static class Sorter implements Comparator<Student> {
		
		public int compare(Student a, Student b)
	    {

			int valueA = a.getAge() != "" ? Integer.valueOf(a.getAge()) : 0;
			int valueB = b.getAge() != "" ? Integer.valueOf(b.getAge()) : 0;
			
			int yearComparison = Integer.compare(Integer.valueOf(a.getYear()), Integer.valueOf(b.getYear()));
			int ageComparison = Integer.compare(valueA, valueB);
	        
//			sort by year first then by age
	        if (yearComparison != 0) {
	           
	            return yearComparison;
	        } else {
	            // If ages are the same, compare by year
	            return ageComparison;
	        }
	    }
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studId) {
		this.studentId = studId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String string) {
		this.department = string;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", name=" + name + ", age=" + age + ", courses=" + courses + ", department="
				+ department + ", year=" + year + ", fee=" + fee + ", paid=" + paid + "]" + "\n";
	}

}
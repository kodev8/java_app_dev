package schoolmanagement.models;

import java.math.BigInteger;

public class Instructor {

	private String instructorId;
	private String name;
	private String subject;
	private BigInteger phoneNumber;
	private String email;
	private String targetYear;
	
	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}

	public String getName() {
		return name;
	}

	public String getTargetYear() {
		return targetYear;
	}

	public void setTargetYear(String targetYear) {
		this.targetYear = targetYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public BigInteger getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", name=" + name + ", subject=" + subject
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", targetYear=" + targetYear + "]";
	}
	
	
}

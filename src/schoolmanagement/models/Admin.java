package schoolmanagement.models;

public class Admin {
	
	private String AdminId;
	private String password;
	private int totalAdmission;
	
	public String getAdminId() {
		return AdminId;
	}

	public void setAdminId(String adminId) {
		AdminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTotalAdmission() {
		return totalAdmission;
	}

	public void setTotalAdmission(int totalAdmission) {
		this.totalAdmission = totalAdmission;
	}

}

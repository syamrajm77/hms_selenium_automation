package model;

public class Login {

	String userName;
	String password;
	String hospitalId;
	String deptId;
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getHospitalId() {
		return hospitalId;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	
}

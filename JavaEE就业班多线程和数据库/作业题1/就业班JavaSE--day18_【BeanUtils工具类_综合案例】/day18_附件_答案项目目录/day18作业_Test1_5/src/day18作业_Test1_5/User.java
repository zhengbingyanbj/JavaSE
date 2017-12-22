package day18ื๗าต_Test1_5;

import java.util.Arrays;

public class User {
	private String loginName;
	private String loginPwd;
	private char sex;
	private String education;
	private String[] hobby;
	public User(String loginName, String loginPwd, char sex, String education, String[] hobby) {
		super();
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.sex = sex;
		this.education = education;
		this.hobby = hobby;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "User [loginName=" + loginName + ", loginPwd=" + loginPwd + ", sex=" + sex + ", education=" + education
				+ ", hobby=" + Arrays.toString(hobby) + "]";
	}
	
	
	
}

package javaooOne.userdemo;

public class User {
	private String userNameString;
	private String passwordString;
	private String emailString;
	
	public User() {
		super();

	}
	public User(String userNameString,String passString,String emaString) {
		setUserNameString(userNameString);
		setEmailString(emaString);
		setPasswordString(emaString);
	}
	
	public String getUserNameString() {
		return userNameString;
	}
	public void setUserNameString(String userNameString) {
		this.userNameString = userNameString;
	}
	public String getPasswordString() {
		return passwordString;
	}
	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	
	
}

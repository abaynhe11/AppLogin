package com.revature.model;

public class LoginInfo
{
	private int TF_USER_ID;
	private String TF_USER_FIRSTNAME;
	private String TF_USER_LASTNAME;
	private String TF_USER_USERNAME;
	private String TF_USER_HASHPASSWORD;
	
	
	public LoginInfo() {
		this.TF_USER_FIRSTNAME = "";
		this.TF_USER_LASTNAME= "";
		this.TF_USER_USERNAME = "";
		this.TF_USER_HASHPASSWORD = "";
	
		
	}

	public LoginInfo(int TF_USER_ID) {
		this();
		this.TF_USER_ID = TF_USER_ID;
	}
	
	public LoginInfo(String TF_USER_USERNAME) {
		this();
		this.TF_USER_USERNAME = TF_USER_USERNAME;
	}
	
	public LoginInfo(String TF_USER_USERNAME, String TF_USER_HASHPASSWORD) {
		this();
		this.TF_USER_USERNAME = TF_USER_USERNAME;
		this.TF_USER_HASHPASSWORD = TF_USER_HASHPASSWORD;
	
	}
	
	public LoginInfo(int TF_USER_ID, String TF_USER_FIRSTNAME, String TF_USER_LASTNAME, String TF_USER_USERNAME, String TF_USER_HASHPASSWORD) {
		this.TF_USER_FIRSTNAME = TF_USER_FIRSTNAME;
		this.TF_USER_LASTNAME = TF_USER_LASTNAME;
		this.TF_USER_USERNAME = TF_USER_USERNAME;
		this.TF_USER_HASHPASSWORD= TF_USER_HASHPASSWORD;		
	}

	public int getTF_USER_Id() {
		return TF_USER_ID;
	}
	
	public void setTF_USER_ID(int TF_USER_ID) {
		this.TF_USER_ID = TF_USER_ID;
	}
	
	public String getTF_USER_FIRSTNAME() {
		return TF_USER_FIRSTNAME;
	}

	public void setTF_USER_FIRSTNAME(String TF_USER_FIRSTNAME) {
		this.TF_USER_FIRSTNAME = TF_USER_FIRSTNAME;
	}

	public String getTF_USER_LASTNAME() {
		return TF_USER_LASTNAME;
	}

	public void setTF_USER_LASTNAME(String TF_USER_LASTNAME) {
		this.TF_USER_LASTNAME = TF_USER_LASTNAME;
	}
	
	public String getTF_USER_USERNAME() {
		return TF_USER_USERNAME;
	}
	public void setTF_USER_USERNAME(String TF_USER_USERNAME) {
		this.TF_USER_USERNAME = TF_USER_USERNAME;
	}
	
	public String getTF_USER_HASHPASSWORD() {
		return TF_USER_HASHPASSWORD;
	}

	public void setTF_USER_HASHPASSWORD(String TF_USER_HASHPASSWORD) {
		this.TF_USER_HASHPASSWORD = TF_USER_HASHPASSWORD;
	}

	

	@Override
	public String toString() {
		return "Login [TF_USER_FIRSTNAME =" + TF_USER_FIRSTNAME + ", TF_USER_LASTNAME =" + TF_USER_LASTNAME + ",TF_USER_USERNAME =" + TF_USER_USERNAME + ", TF_USER_HASHPASSWORD ="
				+ TF_USER_HASHPASSWORD  + " ] ";
	}
}

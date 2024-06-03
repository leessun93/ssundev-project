package com.example.demo.Vo;

public class UserVo {
	private int 	userSeq; 		
	private String 	userId; 			
	private String 	userPassword; 		
	private String 	userName; 			
	private String 	userGender; 		
	private int		loginFailCount; 	
	private String 	passWordEmailAddress; 
	private int 	logInBlock; 
	private int 	lastUserSeq; 
	private String 	lastDateTime;
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public int getLoginFailCount() {
		return loginFailCount;
	}
	public void setLoginFailCount(int loginFailCount) {
		this.loginFailCount = loginFailCount;
	}
	public String getPassWordEmailAddress() {
		return passWordEmailAddress;
	}
	public void setPassWordEmailAddress(String passWordEmailAddress) {
		this.passWordEmailAddress = passWordEmailAddress;
	}
	public int getLogInBlock() {
		return logInBlock;
	}
	public void setLogInBlock(int logInBlock) {
		this.logInBlock = logInBlock;
	}
	public int getLastUserSeq() {
		return lastUserSeq;
	}
	public void setLastUserSeq(int lastUserSeq) {
		this.lastUserSeq = lastUserSeq;
	}
	public String getLastDateTime() {
		return lastDateTime;
	}
	public void setLastDateTime(String lastDateTime) {
		this.lastDateTime = lastDateTime;
	}
	

	
	
	

}

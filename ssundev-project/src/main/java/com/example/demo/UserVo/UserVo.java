package com.example.demo.UserVo;

public class UserVo {
	private int 	UserSeq; 		
	private String 	UserId; 			
	private String 	UserPassword; 		
	private String 	UserName; 			
	private String 	UserGender; 		
	private int		LoginFailCount; 	
	private String 	PassWordEmailAddress; 
	private int 	LogInBlock; 
	private int 	LastUserSeq; 
	private String 	LastDateTime;
	
	public int getUserSeq() {
		return UserSeq;
	}
	public void setUserSeq(int userSeq) {
		UserSeq = userSeq;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserGender() {
		return UserGender;
	}
	public void setUserGender(String userGender) {
		UserGender = userGender;
	}
	public int getLoginFailCount() {
		return LoginFailCount;
	}
	public void setLoginFailCount(int loginFailCount) {
		LoginFailCount = loginFailCount;
	}
	public String getPassWordEmailAddress() {
		return PassWordEmailAddress;
	}
	public void setPassWordEmailAddress(String passWordEmailAddress) {
		PassWordEmailAddress = passWordEmailAddress;
	}
	public int getLogInBlock() {
		return LogInBlock;
	}
	public void setLogInBlock(int logInBlock) {
		LogInBlock = logInBlock;
	}
	public int getLastUserSeq() {
		return LastUserSeq;
	}
	public void setLastUserSeq(int lastUserSeq) {
		LastUserSeq = lastUserSeq;
	}
	public String getLastDateTime() {
		return LastDateTime;
	}
	public void setLastDateTime(String lastDateTime) {
		LastDateTime = lastDateTime;
	}
	
	
	
	
	
	

}

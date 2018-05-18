package com.example.demo.entity;

public class UserEntity {
	private int id;
	private String userName;
	private int userAge;
	private String userAddress;
	private UserSexEnum userSexEnum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public UserSexEnum getUserSexEnum() {
		return userSexEnum;
	}
	public void setUserSexEnum(UserSexEnum userSexEnum) {
		this.userSexEnum = userSexEnum;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", userAge=" + userAge + ", userAddress="
				+ userAddress + ", userSexEnum=" + userSexEnum + "]";
	}
	
	
}

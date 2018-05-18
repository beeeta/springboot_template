package com.example.demo.entity;

public enum UserSexEnum {
	MALE(1),FEMALE(2);
	private int sex;
	private UserSexEnum(int sex) {
		this.sex = sex;
	}
}


package com.example.demo.handler;

import org.apache.ibatis.type.EnumTypeHandler;

import com.example.demo.entity.UserSexEnum;

public class MybatisEnumItemHandler extends EnumTypeHandler<UserSexEnum>{

	public MybatisEnumItemHandler(Class<UserSexEnum> type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

}

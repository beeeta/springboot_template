package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserEntity;

@Service
public class DemoService {
	
	@Autowired
	private UserDao userDao;

	@Cacheable("names")
	public String getName(String string) {
		System.out.println("=== test cache ===");
		System.out.println("=== cache not used ===");
		return "litter cat";
	}
	
	public List<UserEntity> getAll(){
		return userDao.getAll();
	}
}

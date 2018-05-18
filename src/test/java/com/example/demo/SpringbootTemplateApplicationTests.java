package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.action.DemoAction;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserEntity;
import com.example.demo.entity.UserSexEnum;
import com.example.demo.service.DemoService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTemplateApplicationTests {
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Autowired
	private DemoService demoService;
	
	@Autowired
	private UserDao userDao;

	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void testRedis() {
		System.out.println("------testRedis------");
		redisTemplate.opsForValue().set("test:set","testValue1");  
		Assert.assertEquals(redisTemplate.hasKey("test:set"), Boolean.TRUE);
		Assert.assertEquals(demoService.getName("ketty"), "litter cat");
		Assert.assertEquals(demoService.getName("ketty"), "litter cat");
	}
	
	@Test
	public void testMybatis() {
		System.out.println("------testMybatis------");
		UserEntity user = new UserEntity();
		user.setUserName("xiaoming");
		user.setUserAge(10);
		user.setUserAddress("brazier");
		user.setUserSexEnum(UserSexEnum.MALE);
		userDao.insert(user);
		List<UserEntity> users = userDao.getAll();
		System.out.println(users);
	}
	
	
}

package com.example.demo;

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
import com.example.demo.service.DemoService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTemplateApplicationTests {
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Autowired
	private DemoService demoService;

	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void testRedis() {
		redisTemplate.opsForValue().set("test:set","testValue1");  
		Assert.assertEquals(redisTemplate.hasKey("test:set"), Boolean.TRUE);
		Assert.assertEquals(demoService.getName("ketty"), "litter cat");
		Assert.assertEquals(demoService.getName("ketty"), "litter cat");
	}
	
}

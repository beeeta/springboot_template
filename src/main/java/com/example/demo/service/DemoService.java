package com.example.demo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

	@Cacheable("names")
	public String getName(String string) {
		System.out.println("=== test cache ===");
		System.out.println("=== cache not used ===");
		return "litter cat";
	}
}

package com.example.demo.action;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.DemoService;

@RestController
public class DemoAction {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/uid")
	public String uid(HttpSession session) {
		UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
	}
	
	@RequestMapping("/users")
	public List<UserEntity> getUsers() {
		return demoService.getAll();
	}
	
}

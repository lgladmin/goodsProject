package com.accp.action;


import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.pojo.*;
import com.accp.biz.*;

@RestController
@RequestMapping("/api/user")
public class UserAction {
	
	@Autowired 
	private UserBiz biz;
	
	@GetMapping("/login/{username}/{userpwd}")
	public HashMap<String,Object> Login(@PathVariable String username,@PathVariable String userpwd,HttpSession session) {
		Integer i=biz.login(username, userpwd);
		
		HashMap<String,Object> message=new HashMap<String,Object>();
		if(i>0) {
			message.put("code", 200);
			message.put("USERS", new UserInfo(username,userpwd));
			message.put("token", session.getId());
		}else {
			message.put("code", 500);
		}
		
		return message;
	}
	
}







package com.green.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.user.service.UserService;
import com.green.user.vo.UserVo;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService; 
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/WriteForm")
	public  String  writeForm() {		
		return "write";		
	} 
	
	@RequestMapping("/Write")
	public String write(UserVo user, Model model ) {
		
		userService.insertUser(user);
		return  "redirect:/";
	}

	
}

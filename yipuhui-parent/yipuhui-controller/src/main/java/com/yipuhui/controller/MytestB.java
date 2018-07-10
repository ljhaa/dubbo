package com.yipuhui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yipuhui.service.Test;




@Controller
@RequestMapping("/test")
public class MytestB {

	
	@Autowired
	private Test test;
	
	@ResponseBody
	@RequestMapping("/liu")
	public String myTest(@RequestParam("name")String name){
		
		System.out.println(test.testcon(name));
		
		return test.testcon(name);
	}
	
	
	
}

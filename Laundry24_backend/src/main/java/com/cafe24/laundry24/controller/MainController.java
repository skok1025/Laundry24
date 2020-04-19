package com.cafe24.laundry24.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.laundry24.service.MainService;

@Controller
public class MainController {

//	@Autowired
//	private MainService mainService;
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "<h1>hello</h1>";
		//return mainService.getTest();
	}
}

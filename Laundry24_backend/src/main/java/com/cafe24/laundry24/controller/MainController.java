package com.cafe24.laundry24.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "<h1>hello</h1>";
	}
}

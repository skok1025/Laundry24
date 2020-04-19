package com.cafe24.laundry24.test_service_name.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.laundry24.dto.JSONResult;
import com.cafe24.laundry24.test_service_name.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@ResponseBody
	@GetMapping("/test")
	public String test() {
		//String test =  testService.getTest();
		
		return "test";
		//return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success("테스트 DB SELECT 성공", test));
	}
}

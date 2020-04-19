package com.cafe24.laundry24.test_service_name.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.laundry24.test_service_name.repository.TestDao;

@Service
public class TestService {

	@Autowired
	private TestDao testDao;
	
	public String getTest() {
		return testDao.getTest();
	}

}

package com.cafe24.laundry24.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.laundry24.repository.MainDao;

@Service
public class MainService {

	
	@Autowired
	private MainDao mainDao;
	
	public String getTest() {
		return mainDao.getTest();
	}

}

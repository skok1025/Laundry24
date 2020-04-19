package com.cafe24.laundry24.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MainDao {

	@Autowired
	private SqlSession sqlsession;
	
	public String getTest() {
		return sqlsession.selectOne("test.selectTest");
	}

}

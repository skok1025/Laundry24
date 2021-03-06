package com.cafe24.laundry24.controller.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cafe24.laundry24.config.AppConfig;
import com.cafe24.laundry24.config.TestWebConfig;
import com.cafe24.laundry24.config.WebConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class, TestWebConfig.class })
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainControllerTest {

	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.
				webAppContextSetup(webApplicationContext).
				build();
		
	}
	
	@After
	@Rollback(true)
	public void cleanup() {}
	
	@Test
	public void first_test() throws Exception {
		ResultActions resultActions =
				mockMvc
				.perform(
						get("/hello").contentType(MediaType.APPLICATION_JSON));
		
		resultActions
		.andExpect(status().isOk());
						
	}
	
	@Test
	public void second_test() throws Exception {
		ResultActions resultActions =
				mockMvc
				.perform(
						get("/hello2").contentType(MediaType.APPLICATION_JSON));
		
		resultActions
		.andExpect(status().isNotFound());
						
	}
}

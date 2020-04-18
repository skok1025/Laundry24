package com.cafe24.laundry24.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableAspectJAutoProxy
@EnableWebMvc
@ComponentScan({ "com.cafe24.laundry24.controller","com.cafe24.laundry24.exception" })
@Import({TestMVCConfig.class})
public class TestWebConfig{
	
}

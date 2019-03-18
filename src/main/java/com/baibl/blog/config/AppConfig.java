package com.baibl.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.baibl.blog.pojo.User;

@Configuration
//@ComponentScan  //不写参数，只扫描当前包和其子包
@ComponentScan(basePackages = {"com.baibl.blog.pojo"}) 
public class AppConfig {
	
	@Bean(name = "user")
	public User initUser() {
		User user = new User();
		user.setId(8L);
		user.setUserName("user_name_1");
		user.setNote("note_1");
		
		return user;
	}
}

package com.baibl.blog.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataBaseProperties {
	
	@Value("${database.driverName}")
	private String driverName;
	
	@Value("${database.url}")
	private String url;
	
	private String username;
	
	private String password;

	public void setDriverName(String driverName) {
		System.out.println(driverName);
		this.driverName = driverName;
	}
	
	public void setUrl(String url) {
		System.out.println(url);
		this.url = url;
	}

	@Value("${database.username}")
	public void setUsername(String username) {
		System.out.println(username);
		this.username = username;
	}
	
	@Value("${database.password}")
	public void setPassword(String password) {
		System.out.println(password);
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public String getUrl() {
		return url;
	}
	
	
}

package org.coforge.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class user {
	private int userid;
	private String username;
	
	@PostConstruct
	public void init()
	{
		this.userid=102;
		this.username="ntdh";
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy");
	}
	
}

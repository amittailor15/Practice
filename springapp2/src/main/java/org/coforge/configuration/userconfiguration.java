package org.coforge.configuration;

import org.coforge.bean.user;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class userconfiguration {
	
	@Bean
	public user getuser()
	{
		user user=new user();
		user.setUserid(101);
		user.setUsername("name");
		return user;
	}
}

package org.coforge.model;

import org.coforge.bean.user;
import org.coforge.configuration.userconfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class usermain {
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(userconfiguration.class);
		user u=ctx.getBean(user.class);
		System.out.println(u);
		
		((AbstractApplicationContext) ctx).close();
	}
}

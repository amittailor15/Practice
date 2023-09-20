package org.coforge;

import org.coforge.bean.hello;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class hellomain {
	public static void main(String args[])
	{
		BeanFactory ctx;
		ctx=new ClassPathXmlApplicationContext("beans.xml");
		hello h=(hello) ctx.getBean("hello");
		h.display();
	}
}

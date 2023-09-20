package org.coforge;

import java.util.Map;

import org.coforge.bean.product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class productmain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		product pr = ctx.getBean(product.class);
		
		System.out.println(pr);
		
		System.out.println(pr.getPrdid());
		System.out.println(pr.getPrdname());
		System.out.println(pr.getPrcost());
		
		pr.getPrlist().forEach(e->System.out.println(e));
		
		pr.getBikeset().forEach(e->System.out.println(e));

		Map<String,String> carmap=pr.getCarmap();
		
		for(String s : carmap.keySet())
		{
			System.out.println(carmap.get(s));
		}
	}

}

package org.coforge;

import org.coforge.bean.employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class employeemain {

	public static void main(String[] args) {
//		BeanFactory ctx;
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
//		employee employee1=(employee) ctx.getBean("emp1");
//		employee employee2=ctx.getBean("emp1",employee.class);
//		
//		employee1.setEmpid(101);
//		employee1.setEmpname("prateek");
//		employee1.setSalary(30000);
//		employee2.setEmpid(102);
//		employee2.setEmpname("amit");
//		employee2.setSalary(32000);
//		System.out.println(employee1);
//		System.out.println(employee2);
		
		employee employee1=ctx.getBean(employee.class);
        System.out.println(employee1);
        ctx.close();
	}

}

package org.coforge.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class employee {
	private int empid;
	private String empname;
	private float salary;
	
	private Address address;
	
	private void init()
	{
		System.out.println("init called");
	}
	
	private void destroy()
	{
		System.out.println("destroy called");
	}
}

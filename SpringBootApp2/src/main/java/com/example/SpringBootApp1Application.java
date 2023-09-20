package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.model.Employee;

//@SpringBootApplication(scanBasePackages = {"com.example.model,com.example.config"})
//@ComponentScan(basePackages= {"com.example.model"})
//@EnableAutoConfiguration
//@SpringBootConfiguration
@SpringBootApplication
public class SpringBootApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp1Application.class,args);
	}

}

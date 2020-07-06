package com.telusko.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BasicApplication.class, args);
						Code employee = context.getBean(Code.class);
						employee.check();
	}

}

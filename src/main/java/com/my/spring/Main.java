package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.my.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ioc = new AnnotationConfigApplicationContext("com.my.spring.model");

		Employee bean = ioc.getBean("employee", Employee.class);
		bean.getAddress().setCity("Noida");
		bean.getAddress().setState("UP");
		System.out.println(bean);

	}

}

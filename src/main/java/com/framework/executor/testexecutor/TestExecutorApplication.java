package com.framework.executor.testexecutor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.framework.executor.*"})
public class TestExecutorApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		//Start the spring application
		SpringApplication.run(TestExecutorApplication.class, args);
	}
}

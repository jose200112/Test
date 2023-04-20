package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.SystemProperties;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		System.setProperty("java.runtime.version", "1.17");
		SpringApplication.run(Demo1Application.class, args);
	}

}

package com.example.demo.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ExampleAppApplication {
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(
				ExampleAppApplication.class)) {
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}

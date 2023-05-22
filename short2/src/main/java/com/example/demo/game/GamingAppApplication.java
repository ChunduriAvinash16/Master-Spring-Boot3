package com.example.demo.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.game")
public class GamingAppApplication {
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(
				GamingAppApplication.class)) {
			// Creating the configuration class

//			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}
	}
}

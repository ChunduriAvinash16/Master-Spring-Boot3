package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
import com.example.demo.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringJava {
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			// Creating the configuration class

			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}
	}
}

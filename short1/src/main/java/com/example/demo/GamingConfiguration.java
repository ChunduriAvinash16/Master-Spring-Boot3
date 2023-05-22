package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game(){
		return new MarioGame();
	}

	@Bean
	public  GameRunner gameRunner(GamingConsole game){
		return new GameRunner(game);
	}
}

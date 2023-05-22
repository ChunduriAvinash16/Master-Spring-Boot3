package com.example.demo.game;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PacManGame;
import com.example.demo.game.SuperContractGame;

public class AppGamingBasicJava {
	public static void main(String[] args) {
		//var game = new SuperContractGame();
		//var game = new MarioGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}

package com.example.demo.game;

public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Go into hole");
	}
	public void left() {
		System.out.println("Move Back");
	}
	public void right(){
		System.out.println("Move Forward");
	}
}

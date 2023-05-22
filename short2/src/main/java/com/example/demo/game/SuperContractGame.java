package com.example.demo.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContractGameQualifier")
public class SuperContractGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Down");
	}
	public void left() {
		System.out.println("Move Left");
	}
	public void right(){
		System.out.println("Shoot Bullet");
	}
}

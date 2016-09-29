package com.demo.mmo.mmo_entity;

import com.demo.mmo.mmo_entity.game.entity.net.Fight.FightInfo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		FightInfo.Builder info = FightInfo.newBuilder();
		info.setX(1.0f);
		
		System.out.println(info.build().toByteString());

		info.setX(2.0f);
		System.out.println(info.build().toByteString());
	}
}

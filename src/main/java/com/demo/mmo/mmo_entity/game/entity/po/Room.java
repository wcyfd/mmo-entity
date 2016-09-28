package com.demo.mmo.mmo_entity.game.entity.po;

import java.util.HashMap;
import java.util.Map;

public class Room {
	private int id;
	/** 客户端战斗信息战斗信息 */
	private Map<Integer, FightInfo> clientFightInfoMap = new HashMap<>();
	/**服务器战斗信息*/
	private Map<Integer,FightInfo> serverFightInfoMap = new HashMap<>();
	/** 宽度 */
	private float width;
	/** 高度 */
	private float height;

	public Map<Integer, FightInfo> getClientFightInfoMap() {
		return clientFightInfoMap;
	}
	
//	public Map<Integer,FightInfo> getServerFightInfoMap(){
//		
//	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

}

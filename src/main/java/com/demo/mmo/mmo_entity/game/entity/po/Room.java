package com.demo.mmo.mmo_entity.game.entity.po;

import java.util.HashMap;
import java.util.Map;

import com.demo.mmo.mmo_entity.game.entity.net.Fight.FightInfo;
import com.demo.mmo.mmo_entity.game.entity.net.base.Protocal.Response;

public class Room {
	private int id;
	/** 客户端战斗信息 */
	private Map<Integer, FightInfo.Builder> fightInfoMap = new HashMap<>();
	/** 宽度 */
	private float width;
	/** 高度 */
	private float height;
	/** 事件通知数据结构 */
	private Response.Builder noticer = Response.newBuilder();

	public Map<Integer, FightInfo.Builder> getFightInfoMap() {
		return fightInfoMap;
	}

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

	public Response.Builder getNoticer() {
		return noticer;
	}

}

package com.demo.mmo.mmo_entity.game.entity.bo;

public class Role extends GameObject {
	private int roleId;
	private String name;
	private String account;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	@Override
	public boolean isChange() {
		// TODO Auto-generated method stub
		return super.isChange();
	}

}

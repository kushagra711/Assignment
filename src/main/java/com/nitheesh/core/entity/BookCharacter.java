package com.nitheesh.core.entity;



public class BookCharacter {
	
	
	private String name;
	
	private String house;
	
	private String role;
	
	private String status;
	
	private String dies;
	
	
	


	public BookCharacter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookCharacter(String name, String house, String role, String status, String dies) {
		super();
		this.name = name;
		this.house = house;
		this.role = role;
		this.status = status;
		this.dies = dies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDies() {
		return dies;
	}

	public void setDies(String dies) {
		this.dies = dies;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", house=" + house + ", role=" + role + ", status=" + status + ", dies="
				+ dies + "]";
	}
	
	
	
	
	

}


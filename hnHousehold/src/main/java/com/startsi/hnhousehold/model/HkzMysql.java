package com.startsi.hnhousehold.model;

public class HkzMysql implements java.io.Serializable {
	private String id;
	private String name;
	public HkzMysql(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public HkzMysql() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

package com.startsi.hnhousehold.model;

public class Hkz implements java.io.Serializable {
	private String id;
	private String name;
	private String flag;

	public Hkz() {
		super();
	}

	public Hkz(String id, String name, String flag) {
		super();
		this.id = id;
		this.name = name;
		this.flag = flag;
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}

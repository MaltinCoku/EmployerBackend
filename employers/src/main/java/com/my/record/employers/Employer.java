package com.my.record.employers;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employer {

	
	@Id
	private String id;
	private String name;
	private String address;
	private long socialnumber;
	
public Employer() {
		
	}
	
	public Employer(String id, String name, String address, long socialnumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.socialnumber = socialnumber;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getSocialnumber() {
		return socialnumber;
	}
	public void setSocialnumber(long socialnumber) {
		this.socialnumber = socialnumber;
	}
}

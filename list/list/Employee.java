package com.mphasis.list;

import java.util.List;

public class Employee {
	   private int id;
	   private List<Address> address;
	   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
	
}

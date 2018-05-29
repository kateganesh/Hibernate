package com.cs.ganesh.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)


public class Vehicle {
	
	@Id @GeneratedValue
	private int vehicleId;
	private String vehicleName;
	@ManyToMany
	private List<UserDetails> userList = new ArrayList<UserDetails>();
	
	
	public int getVehicleId() {
		return vehicleId;
	} 
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	/*public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}*/
	public List<UserDetails> getUserList() {
		return userList;
	}
	public void setUserList(List<UserDetails> userList) {
		this.userList = userList;
	}
	
	
	
	

}

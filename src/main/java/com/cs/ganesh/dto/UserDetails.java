package com.cs.ganesh.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.mysql.cj.api.xdevapi.Collection;

@Entity (name="USER_DETAILS")
public class UserDetails {
	
	@Id
	@Column (name="USER_ID")
	private int userId;
	@Column  (name="USER_NAME")
	private String userName;

	/*@OneToMany(mappedBy="user")*/
	/*@JoinTable(name = "USER VEHICLE", joinColumns = @JoinColumn(name="USER_ID"),
				inverseJoinColumns= @JoinColumn(name="VEHICLE_ID")			
			)*/
	@ManyToMany
	private List<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
	
	
	
}

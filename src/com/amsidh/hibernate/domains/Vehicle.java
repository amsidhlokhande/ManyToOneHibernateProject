package com.amsidh.hibernate.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="VEHICLE_INFO")
public class Vehicle {

	@GeneratedValue
	@Id
	@Column(name = "VEHICLE_ID")
	private Integer vehicleId;
	@Column(name = "VEHICLE_NAME")
	private String vehicleName;
    @ManyToOne
    @JoinColumn(name="USER_ID")
	private UserDetails user;
	
	
	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}




}

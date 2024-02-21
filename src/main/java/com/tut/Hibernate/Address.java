package com.tut.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Student_Address")
public class Address 
{
	@Id
	@GeneratedValue
	@Column(name="Address_Id")
	private int AddressId;
	@Column(name="City")
	private String City;
	@Column(name="Isopen")
	private boolean Isopen;
	@Transient
	private double Double;
	
	public Address() {}
	public int getAddressId() {
		return AddressId;
	}
	public void setAddressId(int addressId) {
		AddressId = addressId;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public boolean isIsopen() {
		return Isopen;
	}
	public void setIsopen(boolean isopen) {
		Isopen = isopen;
	}
	
	public double getDouble() {
		return Double;
	}
	public void setDouble(double d) {
		Double = d;
	}
	

}

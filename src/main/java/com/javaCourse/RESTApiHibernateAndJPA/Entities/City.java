package com.javaCourse.RESTApiHibernateAndJPA.Entities;

import javax.persistence.*;


@Entity
@Table(name = "City")
public class City {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "countrycode")
	private String countrycode;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "info")
	private String info;
	
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCountryCode() {
		return countrycode;
	}


	public void setCountryCode(String countryCode) {
		this.countrycode = countryCode;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
	

}

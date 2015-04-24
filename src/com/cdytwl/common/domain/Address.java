package com.cdytwl.common.domain;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */

public class Address implements java.io.Serializable {

	// Fields

	private Long id;
	private String province;
	private String city;
	private String county;
	private String street;
	private String housenumber;
	private String addressdes;
	private Integer postcode;

	// Constructors

	/** default constructor */
	public Address() {
	}

	/** full constructor */
	public Address(String province, String city, String county, String street,
			String housenumber, String addressdes, Integer postcode) {
		this.province = province;
		this.city = city;
		this.county = county;
		this.street = street;
		this.housenumber = housenumber;
		this.addressdes = addressdes;
		this.postcode = postcode;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHousenumber() {
		return this.housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getAddressdes() {
		return this.addressdes;
	}

	public void setAddressdes(String addressdes) {
		this.addressdes = addressdes;
	}

	public Integer getPostcode() {
		return this.postcode;
	}

	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}

}
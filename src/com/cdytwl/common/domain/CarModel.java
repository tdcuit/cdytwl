package com.cdytwl.common.domain;

/**
 * CarModel entity. @author MyEclipse Persistence Tools
 */

public class CarModel implements java.io.Serializable {

	// Fields

	private Long id;
	private String carmodelcode;
	private String carmodelname;

	// Constructors

	/** default constructor */
	public CarModel() {
	}

	/** full constructor */
	public CarModel(String carmodelcode, String carmodelname) {
		this.carmodelcode = carmodelcode;
		this.carmodelname = carmodelname;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarmodelcode() {
		return this.carmodelcode;
	}

	public void setCarmodelcode(String carmodelcode) {
		this.carmodelcode = carmodelcode;
	}

	public String getCarmodelname() {
		return this.carmodelname;
	}

	public void setCarmodelname(String carmodelname) {
		this.carmodelname = carmodelname;
	}

}
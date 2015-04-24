package com.cdytwl.common.domain;

/**
 * Car entity. @author MyEclipse Persistence Tools
 */

public class Car implements java.io.Serializable {

	// Fields

	private Long id;
	private Long cartypeid;
	private Long carmodelid;
	private String licenseplatenumber;
	private Long userid;

	// Constructors

	/** default constructor */
	public Car() {
	}

	/** full constructor */
	public Car(Long cartypeid, Long carmodelid, String licenseplatenumber,
			Long userid) {
		this.cartypeid = cartypeid;
		this.carmodelid = carmodelid;
		this.licenseplatenumber = licenseplatenumber;
		this.userid = userid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCartypeid() {
		return this.cartypeid;
	}

	public void setCartypeid(Long cartypeid) {
		this.cartypeid = cartypeid;
	}

	public Long getCarmodelid() {
		return this.carmodelid;
	}

	public void setCarmodelid(Long carmodelid) {
		this.carmodelid = carmodelid;
	}

	public String getLicenseplatenumber() {
		return this.licenseplatenumber;
	}

	public void setLicenseplatenumber(String licenseplatenumber) {
		this.licenseplatenumber = licenseplatenumber;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

}
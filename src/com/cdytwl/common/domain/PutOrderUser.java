package com.cdytwl.common.domain;

/**
 * PutOrderUser entity. @author MyEclipse Persistence Tools
 */

public class PutOrderUser implements java.io.Serializable {

	// Fields

	private Long id;
	private Long putorderuserid;
	private Long orderid;

	// Constructors

	/** default constructor */
	public PutOrderUser() {
	}

	/** full constructor */
	public PutOrderUser(Long putorderuserid, Long orderid) {
		this.putorderuserid = putorderuserid;
		this.orderid = orderid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPutorderuserid() {
		return this.putorderuserid;
	}

	public void setPutorderuserid(Long putorderuserid) {
		this.putorderuserid = putorderuserid;
	}

	public Long getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

}
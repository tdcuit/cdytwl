package com.cdytwl.common.domain;

/**
 * OrderScrambleOrderUser entity. @author MyEclipse Persistence Tools
 */

public class OrderScrambleOrderUser implements java.io.Serializable {

	// Fields

	private Long id;
	private Long scrambleorderuserid;
	private Long orderid;

	// Constructors

	/** default constructor */
	public OrderScrambleOrderUser() {
	}

	/** full constructor */
	public OrderScrambleOrderUser(Long scrambleorderuserid, Long orderid) {
		this.scrambleorderuserid = scrambleorderuserid;
		this.orderid = orderid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getScrambleorderuserid() {
		return this.scrambleorderuserid;
	}

	public void setScrambleorderuserid(Long scrambleorderuserid) {
		this.scrambleorderuserid = scrambleorderuserid;
	}

	public Long getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

}
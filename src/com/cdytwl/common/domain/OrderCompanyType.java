package com.cdytwl.common.domain;

/**
 * OrderCompanyType entity. @author MyEclipse Persistence Tools
 */

public class OrderCompanyType implements java.io.Serializable {

	// Fields

	private Long id;
	private Long corpid;
	private Long orderid;

	// Constructors

	/** default constructor */
	public OrderCompanyType() {
	}

	/** full constructor */
	public OrderCompanyType(Long corpid, Long orderid) {
		this.corpid = corpid;
		this.orderid = orderid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCorpid() {
		return this.corpid;
	}

	public void setCorpid(Long corpid) {
		this.corpid = corpid;
	}

	public Long getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

}
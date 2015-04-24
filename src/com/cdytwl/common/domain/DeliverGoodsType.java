package com.cdytwl.common.domain;

/**
 * DeliverGoodsType entity. @author MyEclipse Persistence Tools
 */

public class DeliverGoodsType implements java.io.Serializable {

	// Fields

	private Long id;
	private String delivergoodscode;
	private String delivergoodstypename;

	// Constructors

	/** default constructor */
	public DeliverGoodsType() {
	}

	/** full constructor */
	public DeliverGoodsType(String delivergoodscode, String delivergoodstypename) {
		this.delivergoodscode = delivergoodscode;
		this.delivergoodstypename = delivergoodstypename;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDelivergoodscode() {
		return this.delivergoodscode;
	}

	public void setDelivergoodscode(String delivergoodscode) {
		this.delivergoodscode = delivergoodscode;
	}

	public String getDelivergoodstypename() {
		return this.delivergoodstypename;
	}

	public void setDelivergoodstypename(String delivergoodstypename) {
		this.delivergoodstypename = delivergoodstypename;
	}

}
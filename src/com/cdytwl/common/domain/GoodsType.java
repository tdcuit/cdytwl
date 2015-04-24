package com.cdytwl.common.domain;

/**
 * GoodsType entity. @author MyEclipse Persistence Tools
 */

public class GoodsType implements java.io.Serializable {

	// Fields

	private Long id;
	private String goodstypecode;
	private String goodstypename;

	// Constructors

	/** default constructor */
	public GoodsType() {
	}

	/** full constructor */
	public GoodsType(String goodstypecode, String goodstypename) {
		this.goodstypecode = goodstypecode;
		this.goodstypename = goodstypename;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGoodstypecode() {
		return this.goodstypecode;
	}

	public void setGoodstypecode(String goodstypecode) {
		this.goodstypecode = goodstypecode;
	}

	public String getGoodstypename() {
		return this.goodstypename;
	}

	public void setGoodstypename(String goodstypename) {
		this.goodstypename = goodstypename;
	}

}
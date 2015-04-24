package com.cdytwl.common.domain;

/**
 * GoodsPic entity. @author MyEclipse Persistence Tools
 */

public class GoodsPic implements java.io.Serializable {

	// Fields

	private Long id;
	private Long goodsid;
	private Long picid;

	// Constructors

	/** default constructor */
	public GoodsPic() {
	}

	/** full constructor */
	public GoodsPic(Long goodsid, Long picid) {
		this.goodsid = goodsid;
		this.picid = picid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(Long goodsid) {
		this.goodsid = goodsid;
	}

	public Long getPicid() {
		return this.picid;
	}

	public void setPicid(Long picid) {
		this.picid = picid;
	}

}
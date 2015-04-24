package com.cdytwl.common.domain;

/**
 * CarType entity. @author MyEclipse Persistence Tools
 */

public class CarType implements java.io.Serializable {

	// Fields

	private Long id;
	private String cartypecode;
	private String cartypename;

	// Constructors

	/** default constructor */
	public CarType() {
	}

	/** full constructor */
	public CarType(String cartypecode, String cartypename) {
		this.cartypecode = cartypecode;
		this.cartypename = cartypename;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCartypecode() {
		return this.cartypecode;
	}

	public void setCartypecode(String cartypecode) {
		this.cartypecode = cartypecode;
	}

	public String getCartypename() {
		return this.cartypename;
	}

	public void setCartypename(String cartypename) {
		this.cartypename = cartypename;
	}

}
package com.cdytwl.common.domain;

/**
 * BiddingPriceWay entity. @author MyEclipse Persistence Tools
 */

public class BiddingPriceWay implements java.io.Serializable {

	// Fields

	private Long id;
	private String biddingpricecode;
	private String biddingpricename;

	// Constructors

	/** default constructor */
	public BiddingPriceWay() {
	}

	/** full constructor */
	public BiddingPriceWay(String biddingpricecode, String biddingpricename) {
		this.biddingpricecode = biddingpricecode;
		this.biddingpricename = biddingpricename;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBiddingpricecode() {
		return this.biddingpricecode;
	}

	public void setBiddingpricecode(String biddingpricecode) {
		this.biddingpricecode = biddingpricecode;
	}

	public String getBiddingpricename() {
		return this.biddingpricename;
	}

	public void setBiddingpricename(String biddingpricename) {
		this.biddingpricename = biddingpricename;
	}

}
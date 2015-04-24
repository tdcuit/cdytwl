package com.cdytwl.common.domain;

/**
 * BiddingPrice entity. @author MyEclipse Persistence Tools
 */

public class BiddingPrice implements java.io.Serializable {

	// Fields

	private Long id;
	private Long biddingpriceuserid;
	private Double biddingmoney;
	private Long orderid;
	private Long biddingpricewayid;

	// Constructors

	/** default constructor */
	public BiddingPrice() {
	}

	/** full constructor */
	public BiddingPrice(Long biddingpriceuserid, Double biddingmoney,
			Long orderid, Long biddingpricewayid) {
		this.biddingpriceuserid = biddingpriceuserid;
		this.biddingmoney = biddingmoney;
		this.orderid = orderid;
		this.biddingpricewayid = biddingpricewayid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBiddingpriceuserid() {
		return this.biddingpriceuserid;
	}

	public void setBiddingpriceuserid(Long biddingpriceuserid) {
		this.biddingpriceuserid = biddingpriceuserid;
	}

	public Double getBiddingmoney() {
		return this.biddingmoney;
	}

	public void setBiddingmoney(Double biddingmoney) {
		this.biddingmoney = biddingmoney;
	}

	public Long getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public Long getBiddingpricewayid() {
		return this.biddingpricewayid;
	}

	public void setBiddingpricewayid(Long biddingpricewayid) {
		this.biddingpricewayid = biddingpricewayid;
	}

}
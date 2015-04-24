package com.cdytwl.common.domain;

import java.util.Date;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Long id;
	private Long goodstypeid;
	private Date shipmenttime;
	private Date arrivalgoodstime;
	private Double weight;
	private Long delivergoodstypeid;
	private Double shippingprice;
	private Long orderid;

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** minimal constructor */
	public Goods(Long goodstypeid, Date shipmenttime, Date arrivalgoodstime,
			Double weight, Long delivergoodstypeid) {
		this.goodstypeid = goodstypeid;
		this.shipmenttime = shipmenttime;
		this.arrivalgoodstime = arrivalgoodstime;
		this.weight = weight;
		this.delivergoodstypeid = delivergoodstypeid;
	}

	/** full constructor */
	public Goods(Long goodstypeid, Date shipmenttime, Date arrivalgoodstime,
			Double weight, Long delivergoodstypeid, Double shippingprice,
			Long orderid) {
		this.goodstypeid = goodstypeid;
		this.shipmenttime = shipmenttime;
		this.arrivalgoodstime = arrivalgoodstime;
		this.weight = weight;
		this.delivergoodstypeid = delivergoodstypeid;
		this.shippingprice = shippingprice;
		this.orderid = orderid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGoodstypeid() {
		return this.goodstypeid;
	}

	public void setGoodstypeid(Long goodstypeid) {
		this.goodstypeid = goodstypeid;
	}

	public Date getShipmenttime() {
		return this.shipmenttime;
	}

	public void setShipmenttime(Date shipmenttime) {
		this.shipmenttime = shipmenttime;
	}

	public Date getArrivalgoodstime() {
		return this.arrivalgoodstime;
	}

	public void setArrivalgoodstime(Date arrivalgoodstime) {
		this.arrivalgoodstime = arrivalgoodstime;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Long getDelivergoodstypeid() {
		return this.delivergoodstypeid;
	}

	public void setDelivergoodstypeid(Long delivergoodstypeid) {
		this.delivergoodstypeid = delivergoodstypeid;
	}

	public Double getShippingprice() {
		return this.shippingprice;
	}

	public void setShippingprice(Double shippingprice) {
		this.shippingprice = shippingprice;
	}

	public Long getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

}
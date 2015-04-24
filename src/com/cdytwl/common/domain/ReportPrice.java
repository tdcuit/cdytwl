package com.cdytwl.common.domain;

/**
 * ReportPrice entity. @author MyEclipse Persistence Tools
 */

public class ReportPrice implements java.io.Serializable {

	// Fields

	private Long id;
	private Long reportpriceuserid;
	private Double reportmoney;
	private Long orderid;

	// Constructors

	/** default constructor */
	public ReportPrice() {
	}

	/** full constructor */
	public ReportPrice(Long reportpriceuserid, Double reportmoney, Long orderid) {
		this.reportpriceuserid = reportpriceuserid;
		this.reportmoney = reportmoney;
		this.orderid = orderid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getReportpriceuserid() {
		return this.reportpriceuserid;
	}

	public void setReportpriceuserid(Long reportpriceuserid) {
		this.reportpriceuserid = reportpriceuserid;
	}

	public Double getReportmoney() {
		return this.reportmoney;
	}

	public void setReportmoney(Double reportmoney) {
		this.reportmoney = reportmoney;
	}

	public Long getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

}
package com.cdytwl.common.domain;

/**
 * InsuranceSheet entity. @author MyEclipse Persistence Tools
 */

public class InsuranceSheet implements java.io.Serializable {

	// Fields

	private Long id;
	private Double insurancesheetmoney;
	private String insurancesheetname;
	private Double insurancesheetrate;
	private Long orderid;

	// Constructors

	/** default constructor */
	public InsuranceSheet() {
	}

	/** minimal constructor */
	public InsuranceSheet(Double insurancesheetmoney, Double insurancesheetrate) {
		this.insurancesheetmoney = insurancesheetmoney;
		this.insurancesheetrate = insurancesheetrate;
	}

	/** full constructor */
	public InsuranceSheet(Double insurancesheetmoney,
			String insurancesheetname, Double insurancesheetrate, Long orderid) {
		this.insurancesheetmoney = insurancesheetmoney;
		this.insurancesheetname = insurancesheetname;
		this.insurancesheetrate = insurancesheetrate;
		this.orderid = orderid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getInsurancesheetmoney() {
		return this.insurancesheetmoney;
	}

	public void setInsurancesheetmoney(Double insurancesheetmoney) {
		this.insurancesheetmoney = insurancesheetmoney;
	}

	public String getInsurancesheetname() {
		return this.insurancesheetname;
	}

	public void setInsurancesheetname(String insurancesheetname) {
		this.insurancesheetname = insurancesheetname;
	}

	public Double getInsurancesheetrate() {
		return this.insurancesheetrate;
	}

	public void setInsurancesheetrate(Double insurancesheetrate) {
		this.insurancesheetrate = insurancesheetrate;
	}

	public Long getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

}
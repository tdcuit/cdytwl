package com.cdytwl.common.domain;

/**
 * CompanyType entity. @author MyEclipse Persistence Tools
 */

public class CompanyType implements java.io.Serializable {

	// Fields

	private Long id;
	private String industrycode;
	private String industrydes;

	// Constructors

	/** default constructor */
	public CompanyType() {
	}

	/** full constructor */
	public CompanyType(String industrycode, String industrydes) {
		this.industrycode = industrycode;
		this.industrydes = industrydes;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIndustrycode() {
		return this.industrycode;
	}

	public void setIndustrycode(String industrycode) {
		this.industrycode = industrycode;
	}

	public String getIndustrydes() {
		return this.industrydes;
	}

	public void setIndustrydes(String industrydes) {
		this.industrydes = industrydes;
	}

}
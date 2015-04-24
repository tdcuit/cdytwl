package com.cdytwl.common.domain;

/**
 * Company entity. @author MyEclipse Persistence Tools
 */

public class Company implements java.io.Serializable {

	// Fields

	private Long id;
	private String corpname;
	private String corpregisternumber;
	private Long corpheadpicid;
	private Long companytypeid;
	private Long corpaddressid;
	private Long telephone;
	private Long tel;
	private Long businesslicensepicid;
	private String taxregistrynumber;
	private Long legalpersonid;

	// Constructors

	/** default constructor */
	public Company() {
	}

	/** minimal constructor */
	public Company(String corpname) {
		this.corpname = corpname;
	}

	/** full constructor */
	public Company(String corpname, String corpregisternumber,
			Long corpheadpicid, Long companytypeid, Long corpaddressid,
			Long telephone, Long tel, Long businesslicensepicid,
			String taxregistrynumber, Long legalpersonid) {
		this.corpname = corpname;
		this.corpregisternumber = corpregisternumber;
		this.corpheadpicid = corpheadpicid;
		this.companytypeid = companytypeid;
		this.corpaddressid = corpaddressid;
		this.telephone = telephone;
		this.tel = tel;
		this.businesslicensepicid = businesslicensepicid;
		this.taxregistrynumber = taxregistrynumber;
		this.legalpersonid = legalpersonid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorpname() {
		return this.corpname;
	}

	public void setCorpname(String corpname) {
		this.corpname = corpname;
	}

	public String getCorpregisternumber() {
		return this.corpregisternumber;
	}

	public void setCorpregisternumber(String corpregisternumber) {
		this.corpregisternumber = corpregisternumber;
	}

	public Long getCorpheadpicid() {
		return this.corpheadpicid;
	}

	public void setCorpheadpicid(Long corpheadpicid) {
		this.corpheadpicid = corpheadpicid;
	}

	public Long getCompanytypeid() {
		return this.companytypeid;
	}

	public void setCompanytypeid(Long companytypeid) {
		this.companytypeid = companytypeid;
	}

	public Long getCorpaddressid() {
		return this.corpaddressid;
	}

	public void setCorpaddressid(Long corpaddressid) {
		this.corpaddressid = corpaddressid;
	}

	public Long getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public Long getTel() {
		return this.tel;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	public Long getBusinesslicensepicid() {
		return this.businesslicensepicid;
	}

	public void setBusinesslicensepicid(Long businesslicensepicid) {
		this.businesslicensepicid = businesslicensepicid;
	}

	public String getTaxregistrynumber() {
		return this.taxregistrynumber;
	}

	public void setTaxregistrynumber(String taxregistrynumber) {
		this.taxregistrynumber = taxregistrynumber;
	}

	public Long getLegalpersonid() {
		return this.legalpersonid;
	}

	public void setLegalpersonid(Long legalpersonid) {
		this.legalpersonid = legalpersonid;
	}

}
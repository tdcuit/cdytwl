package com.cdytwl.common.domain;

/**
 * BankCard entity. @author MyEclipse Persistence Tools
 */

public class BankCard implements java.io.Serializable {

	// Fields

	private Long id;
	private Long bankcardnumber;
	private String bankcardname;
	private String bankname;
	private String bankaccoutname;
	private String bankcarddes;
	private Long userid;
	private Long corpid;

	// Constructors

	/** default constructor */
	public BankCard() {
	}

	/** minimal constructor */
	public BankCard(Long bankcardnumber, String bankcardname, String bankname,
			String bankaccoutname) {
		this.bankcardnumber = bankcardnumber;
		this.bankcardname = bankcardname;
		this.bankname = bankname;
		this.bankaccoutname = bankaccoutname;
	}

	/** full constructor */
	public BankCard(Long bankcardnumber, String bankcardname, String bankname,
			String bankaccoutname, String bankcarddes, Long userid, Long corpid) {
		this.bankcardnumber = bankcardnumber;
		this.bankcardname = bankcardname;
		this.bankname = bankname;
		this.bankaccoutname = bankaccoutname;
		this.bankcarddes = bankcarddes;
		this.userid = userid;
		this.corpid = corpid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBankcardnumber() {
		return this.bankcardnumber;
	}

	public void setBankcardnumber(Long bankcardnumber) {
		this.bankcardnumber = bankcardnumber;
	}

	public String getBankcardname() {
		return this.bankcardname;
	}

	public void setBankcardname(String bankcardname) {
		this.bankcardname = bankcardname;
	}

	public String getBankname() {
		return this.bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBankaccoutname() {
		return this.bankaccoutname;
	}

	public void setBankaccoutname(String bankaccoutname) {
		this.bankaccoutname = bankaccoutname;
	}

	public String getBankcarddes() {
		return this.bankcarddes;
	}

	public void setBankcarddes(String bankcarddes) {
		this.bankcarddes = bankcarddes;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Long getCorpid() {
		return this.corpid;
	}

	public void setCorpid(Long corpid) {
		this.corpid = corpid;
	}

}
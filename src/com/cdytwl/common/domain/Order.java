package com.cdytwl.common.domain;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Long id;
	private Long biddingpricewayid;
	private Long setoffaddressid;
	private Long destinationaddressid;
	private Boolean whetherpadfunded;
	private Double padfundedmoney;
	private Double totalmoney;
	private Double differmoney;
	private String whethercashondelivery;
	private Double signreceiptmoney;
	private Double punchcardmoney;
	private String whetherpickupgoods;
	private Long delivergoodstypeid;
	private String whetherdelivergoods;
	private String whetherinsure;
	private String differmoneyconfirm;
	private String tradefinishedconfirm;
	private String arrivalgoodsconfirm;
	private String receiptorderconfirm;
	private Double mileage;
	private String comment;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** full constructor */
	public Order(Long biddingpricewayid, Long setoffaddressid,
			Long destinationaddressid, Boolean whetherpadfunded,
			Double padfundedmoney, Double totalmoney, Double differmoney,
			String whethercashondelivery, Double signreceiptmoney,
			Double punchcardmoney, String whetherpickupgoods,
			Long delivergoodstypeid, String whetherdelivergoods,
			String whetherinsure, String differmoneyconfirm,
			String tradefinishedconfirm, String arrivalgoodsconfirm,
			String receiptorderconfirm, Double mileage, String comment) {
		this.biddingpricewayid = biddingpricewayid;
		this.setoffaddressid = setoffaddressid;
		this.destinationaddressid = destinationaddressid;
		this.whetherpadfunded = whetherpadfunded;
		this.padfundedmoney = padfundedmoney;
		this.totalmoney = totalmoney;
		this.differmoney = differmoney;
		this.whethercashondelivery = whethercashondelivery;
		this.signreceiptmoney = signreceiptmoney;
		this.punchcardmoney = punchcardmoney;
		this.whetherpickupgoods = whetherpickupgoods;
		this.delivergoodstypeid = delivergoodstypeid;
		this.whetherdelivergoods = whetherdelivergoods;
		this.whetherinsure = whetherinsure;
		this.differmoneyconfirm = differmoneyconfirm;
		this.tradefinishedconfirm = tradefinishedconfirm;
		this.arrivalgoodsconfirm = arrivalgoodsconfirm;
		this.receiptorderconfirm = receiptorderconfirm;
		this.mileage = mileage;
		this.comment = comment;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBiddingpricewayid() {
		return this.biddingpricewayid;
	}

	public void setBiddingpricewayid(Long biddingpricewayid) {
		this.biddingpricewayid = biddingpricewayid;
	}

	public Long getSetoffaddressid() {
		return this.setoffaddressid;
	}

	public void setSetoffaddressid(Long setoffaddressid) {
		this.setoffaddressid = setoffaddressid;
	}

	public Long getDestinationaddressid() {
		return this.destinationaddressid;
	}

	public void setDestinationaddressid(Long destinationaddressid) {
		this.destinationaddressid = destinationaddressid;
	}

	public Boolean getWhetherpadfunded() {
		return this.whetherpadfunded;
	}

	public void setWhetherpadfunded(Boolean whetherpadfunded) {
		this.whetherpadfunded = whetherpadfunded;
	}

	public Double getPadfundedmoney() {
		return this.padfundedmoney;
	}

	public void setPadfundedmoney(Double padfundedmoney) {
		this.padfundedmoney = padfundedmoney;
	}

	public Double getTotalmoney() {
		return this.totalmoney;
	}

	public void setTotalmoney(Double totalmoney) {
		this.totalmoney = totalmoney;
	}

	public Double getDiffermoney() {
		return this.differmoney;
	}

	public void setDiffermoney(Double differmoney) {
		this.differmoney = differmoney;
	}

	public String getWhethercashondelivery() {
		return this.whethercashondelivery;
	}

	public void setWhethercashondelivery(String whethercashondelivery) {
		this.whethercashondelivery = whethercashondelivery;
	}

	public Double getSignreceiptmoney() {
		return this.signreceiptmoney;
	}

	public void setSignreceiptmoney(Double signreceiptmoney) {
		this.signreceiptmoney = signreceiptmoney;
	}

	public Double getPunchcardmoney() {
		return this.punchcardmoney;
	}

	public void setPunchcardmoney(Double punchcardmoney) {
		this.punchcardmoney = punchcardmoney;
	}

	public String getWhetherpickupgoods() {
		return this.whetherpickupgoods;
	}

	public void setWhetherpickupgoods(String whetherpickupgoods) {
		this.whetherpickupgoods = whetherpickupgoods;
	}

	public Long getDelivergoodstypeid() {
		return this.delivergoodstypeid;
	}

	public void setDelivergoodstypeid(Long delivergoodstypeid) {
		this.delivergoodstypeid = delivergoodstypeid;
	}

	public String getWhetherdelivergoods() {
		return this.whetherdelivergoods;
	}

	public void setWhetherdelivergoods(String whetherdelivergoods) {
		this.whetherdelivergoods = whetherdelivergoods;
	}

	public String getWhetherinsure() {
		return this.whetherinsure;
	}

	public void setWhetherinsure(String whetherinsure) {
		this.whetherinsure = whetherinsure;
	}

	public String getDiffermoneyconfirm() {
		return this.differmoneyconfirm;
	}

	public void setDiffermoneyconfirm(String differmoneyconfirm) {
		this.differmoneyconfirm = differmoneyconfirm;
	}

	public String getTradefinishedconfirm() {
		return this.tradefinishedconfirm;
	}

	public void setTradefinishedconfirm(String tradefinishedconfirm) {
		this.tradefinishedconfirm = tradefinishedconfirm;
	}

	public String getArrivalgoodsconfirm() {
		return this.arrivalgoodsconfirm;
	}

	public void setArrivalgoodsconfirm(String arrivalgoodsconfirm) {
		this.arrivalgoodsconfirm = arrivalgoodsconfirm;
	}

	public String getReceiptorderconfirm() {
		return this.receiptorderconfirm;
	}

	public void setReceiptorderconfirm(String receiptorderconfirm) {
		this.receiptorderconfirm = receiptorderconfirm;
	}

	public Double getMileage() {
		return this.mileage;
	}

	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
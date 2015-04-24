package com.cdytwl.common.domain;

/**
 * OrderReceiptOrderPic entity. @author MyEclipse Persistence Tools
 */

public class OrderReceiptOrderPic implements java.io.Serializable {

	// Fields

	private Long id;
	private Long receiptorderpicid;
	private Long orderid;

	// Constructors

	/** default constructor */
	public OrderReceiptOrderPic() {
	}

	/** full constructor */
	public OrderReceiptOrderPic(Long receiptorderpicid, Long orderid) {
		this.receiptorderpicid = receiptorderpicid;
		this.orderid = orderid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getReceiptorderpicid() {
		return this.receiptorderpicid;
	}

	public void setReceiptorderpicid(Long receiptorderpicid) {
		this.receiptorderpicid = receiptorderpicid;
	}

	public Long getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

}
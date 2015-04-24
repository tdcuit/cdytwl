package com.cdytwl.common.domain;

/**
 * RouteLine entity. @author MyEclipse Persistence Tools
 */

public class RouteLine implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer setoffpostcode;
	private Integer destinationpostcode;
	private String setoffprovince;
	private String destinationprovince;
	private String setoffcity;
	private String destinationcity;
	private String setoffcounty;
	private String destinationcounty;
	private String setoffstreet;
	private String destinationstreet;

	// Constructors

	/** default constructor */
	public RouteLine() {
	}

	/** full constructor */
	public RouteLine(Integer setoffpostcode, Integer destinationpostcode,
			String setoffprovince, String destinationprovince,
			String setoffcity, String destinationcity, String setoffcounty,
			String destinationcounty, String setoffstreet,
			String destinationstreet) {
		this.setoffpostcode = setoffpostcode;
		this.destinationpostcode = destinationpostcode;
		this.setoffprovince = setoffprovince;
		this.destinationprovince = destinationprovince;
		this.setoffcity = setoffcity;
		this.destinationcity = destinationcity;
		this.setoffcounty = setoffcounty;
		this.destinationcounty = destinationcounty;
		this.setoffstreet = setoffstreet;
		this.destinationstreet = destinationstreet;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSetoffpostcode() {
		return this.setoffpostcode;
	}

	public void setSetoffpostcode(Integer setoffpostcode) {
		this.setoffpostcode = setoffpostcode;
	}

	public Integer getDestinationpostcode() {
		return this.destinationpostcode;
	}

	public void setDestinationpostcode(Integer destinationpostcode) {
		this.destinationpostcode = destinationpostcode;
	}

	public String getSetoffprovince() {
		return this.setoffprovince;
	}

	public void setSetoffprovince(String setoffprovince) {
		this.setoffprovince = setoffprovince;
	}

	public String getDestinationprovince() {
		return this.destinationprovince;
	}

	public void setDestinationprovince(String destinationprovince) {
		this.destinationprovince = destinationprovince;
	}

	public String getSetoffcity() {
		return this.setoffcity;
	}

	public void setSetoffcity(String setoffcity) {
		this.setoffcity = setoffcity;
	}

	public String getDestinationcity() {
		return this.destinationcity;
	}

	public void setDestinationcity(String destinationcity) {
		this.destinationcity = destinationcity;
	}

	public String getSetoffcounty() {
		return this.setoffcounty;
	}

	public void setSetoffcounty(String setoffcounty) {
		this.setoffcounty = setoffcounty;
	}

	public String getDestinationcounty() {
		return this.destinationcounty;
	}

	public void setDestinationcounty(String destinationcounty) {
		this.destinationcounty = destinationcounty;
	}

	public String getSetoffstreet() {
		return this.setoffstreet;
	}

	public void setSetoffstreet(String setoffstreet) {
		this.setoffstreet = setoffstreet;
	}

	public String getDestinationstreet() {
		return this.destinationstreet;
	}

	public void setDestinationstreet(String destinationstreet) {
		this.destinationstreet = destinationstreet;
	}

}
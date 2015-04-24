package com.cdytwl.common.domain;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Long id;
	private String nickname;
	private String username;
	private Long headpicid;
	private String email;
	private Long telephone;
	private String driverlicense;
	private String vehiclelicense;
	private String identitycardnumber;
	private String password;
	private String confirmpassword;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String nickname, String username, Long headpicid, String email,
			Long telephone, String driverlicense, String vehiclelicense,
			String identitycardnumber, String password,
			String confirmpassword) {
		this.nickname = nickname;
		this.username = username;
		this.headpicid = headpicid;
		this.email = email;
		this.telephone = telephone;
		this.driverlicense = driverlicense;
		this.vehiclelicense = vehiclelicense;
		this.identitycardnumber = identitycardnumber;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getHeadpicid() {
		return this.headpicid;
	}

	public void setHeadpicid(Long headpicid) {
		this.headpicid = headpicid;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public String getDriverlicense() {
		return this.driverlicense;
	}

	public void setDriverlicense(String driverlicense) {
		this.driverlicense = driverlicense;
	}

	public String getVehiclelicense() {
		return this.vehiclelicense;
	}

	public void setVehiclelicense(String vehiclelicense) {
		this.vehiclelicense = vehiclelicense;
	}

	public String getIdentitycardnumber() {
		return this.identitycardnumber;
	}

	public void setIdentitycardnumber(String identitycardnumber) {
		this.identitycardnumber = identitycardnumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

}
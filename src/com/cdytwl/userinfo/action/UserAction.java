package com.cdytwl.userinfo.action;

import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.cdytwl.common.domain.User;
import com.cdytwl.userinfo.service.UserManager;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = -3446997757950181188L;
	private static final String SUCESS = "SUCESS";
	//private static final String FAILED = "FAILED";
	private static final String LISTUSERS = "LISTUSERS";
	private static final String FINDUSERFORUPDATESUCESS = "FINDUSERFORUPDATESUCESS";
	private static final String FINDUSERFORUPDATEFAILED = "FINDUSERFORUPDATEFAILED";
	private static final String LOGINFAILED = "LOGINFAILED";
	private static final String UPDATEUSERFAILED = "UPDATEUSERFAILED";

	private Logger log = Logger.getLogger(UserAction.class);
	private UserManager userManager;
	private User user;
	private List<User> users;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String execute() throws Exception {
		return listUsers();
	}

	public String addUser() {
		log.info("[UserAction.addUser] **********");
		String result = userManager.addUser(user);
		if (SUCESS.equals(result)) {
			return listUsers();
		} else {
			return listUsers();
		}
	}

	public String listUsers() {
		List<User> users = findUsers();
		ActionContext.getContext().put("users", users);
		return LISTUSERS;
	}

	public String deleteUser() {
		log.info("[UserAction.deleteUser] **********");
		String result = userManager.deleteUserById(id);
		if (SUCESS.equals(result)) {
			return listUsers();
		} else {
			return listUsers();
		}
	}

	public String findUserForUpdate() {
		log.info("[UserAction.findUserForUpdate] **********");
		user = userManager.findUserById(id);
		if (user == null) {
			return FINDUSERFORUPDATEFAILED;
		} else {
			ActionContext.getContext().put("user", user);
			return FINDUSERFORUPDATESUCESS;
		}
	}

	public String updateUser() {
		log.info("[UserAction.updateUser] **********");
		String result = userManager.updateUser(user);
		if (SUCESS.equals(result)) {
			return listUsers();
		} else {
			return UPDATEUSERFAILED;
		}
	}

	public List<User> findUsers() {
		log.info("[UserAction.findUsers] **********");
		List<User> users = (List<User>) userManager.findUsers();
		return users;
	}

	public String login() {
		log.info("[UserAction.login] **********");
		String result = userManager.login(user);
		if (SUCESS.equals(result)) {
			return listUsers();
		} else {
			return LOGINFAILED;
		}
	}
}

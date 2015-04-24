package com.cdytwl.userinfo.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.cdytwl.userinfo.dao.UserDao;
import com.cdytwl.common.domain.User;
import com.cdytwl.userinfo.service.UserManager;

public class UserManagerImpl implements UserManager {

	private UserDao userDao = null;
	private static final String SUCESS = "SUCESS";
	private static final String FAILED = "FAILED";

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String addUser(User u) {
		try {
			userDao.addUser(u);
		} catch (Exception e) {
			return FAILED;
		} finally {
		}
		return SUCESS;
	}

	public String deleteUserById(Long id) {
		try {
			userDao.deleteUser(id);
		} catch (Exception e) {
			return FAILED;
		} finally {
		}
		return SUCESS;
	}

	public String updateUser(User u) {
		try {
			userDao.updateUser(u);
		} catch (Exception e) {
			return FAILED;
		} finally {
		}
		return SUCESS;
	}

	public User findUserById(Long id) {
		return userDao.findUserById(id);
	}

	public List<User> findUsers() {
		return (List<User>) userDao.getUsers();
	}

	public List<User> searchUser(String queryString) {
		return null;
	}

	public List<User> findUsersByName(String name) {
		return (List<User>) userDao.getUsersByName(name);
	}

	public String login(User user) {
		String userName = user.getUsername();
		String userPassword = user.getPassword();
		if (StringUtils.isBlank(userName) || StringUtils.isBlank(userPassword)) {
			return FAILED;
		}

		List<User> userResults = findUsersByName(userName);
		for (User userResult : userResults) {
			if (userName.equals(userResult.getUsername())
					&& userPassword.equals(userResult.getPassword())) {
				return SUCESS;
			}
		}
		return FAILED;
	}

}

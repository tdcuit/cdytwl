package com.cdytwl.userinfo.service;

import java.util.List;

import com.cdytwl.common.domain.User;

public interface UserManager {

	public String addUser(User u);

	public String updateUser(User u);

	public String deleteUserById(Long id);

	public List<User> searchUser(String queryString);

	public User findUserById(Long id);

	public List<User> findUsers();

	public List<User> findUsersByName(String name);

	public String login(User user);

}

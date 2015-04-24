package com.cdytwl.userinfo.dao;

import java.util.List;

import com.cdytwl.common.domain.User;

public interface UserDao {
	public void addUser(User u);

	public void updateUser(User user);

	public void deleteUser(Long id);

	public User findUserById(Long id);

	public List<User> getUsers();

	public List<User> getUsersByName(String name);

}

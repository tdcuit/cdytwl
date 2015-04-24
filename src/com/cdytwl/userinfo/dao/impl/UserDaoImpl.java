package com.cdytwl.userinfo.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cdytwl.userinfo.dao.UserDao;
import com.cdytwl.common.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public void addUser(User u) {
		getHibernateTemplate().save(u);

	}

	public User findUserById(Long id) {
		try {
			return (User) getHibernateTemplate().get(User.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		return (List<User>) getHibernateTemplate().find("from User");
	}

	public void deleteUser(Long id) {
		getHibernateTemplate().delete(findUserById(id));
	}

	public void updateUser(User user) {
		getHibernateTemplate().saveOrUpdate(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> getUsersByName(String name) {
		return (List<User>) getHibernateTemplate().find(
				"from User where username=" + name);
	}

}

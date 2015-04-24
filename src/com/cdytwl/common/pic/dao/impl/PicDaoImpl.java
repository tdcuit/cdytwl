package com.cdytwl.common.pic.dao.impl;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cdytwl.common.pic.dao.PicDao;
import com.cdytwl.common.domain.Pic;

public class PicDaoImpl extends HibernateDaoSupport implements PicDao {

	@SuppressWarnings("unchecked")
	public List<Pic> findPics() {
		return (List<Pic>)getHibernateTemplate().find("from Pic");
	}

	public Pic getPicById(long id) {
		try {
			return (Pic)getHibernateTemplate().get(Pic.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean addPic(Pic pic) {
		try {
			 System.out.println("Ô­Í¼£º"+pic.getThumbnailpic());
			 getHibernateTemplate().save(pic);
			 return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	} 
}

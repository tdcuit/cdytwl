package com.cdytwl.common.pic.service.impl;

import java.util.List;

import com.cdytwl.common.pic.dao.PicDao;
import com.cdytwl.common.domain.Pic;
import com.cdytwl.common.pic.service.PicManager;

public class PicManagerImpl implements PicManager {

	private PicDao picDao;
	
	
	
	public PicDao getPicDao() {
		return picDao;
	}

	public void setPicDao(PicDao picDao) {
		this.picDao = picDao;
	}

	
	public boolean addPic(Pic pic) {
		return picDao.addPic(pic);
	}

	public List<Pic> findPics() {
		return picDao.findPics();
	}

	public Pic getPicById(long id) {
		return picDao.getPicById(id);
		
	}
}

package com.cdytwl.common.pic.dao;

import java.util.List;

import com.cdytwl.common.domain.Pic;

public interface PicDao {
	
	public List<Pic> findPics();
	
	public Pic getPicById(long id);
	
	public boolean addPic(Pic pic);
	
}

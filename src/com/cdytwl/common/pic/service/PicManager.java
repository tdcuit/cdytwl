package com.cdytwl.common.pic.service;


import java.util.List;

import com.cdytwl.common.domain.Pic;

public interface PicManager {
	
	public boolean addPic(Pic pic);
	
	public List<Pic> findPics();
	
	public Pic getPicById(long id);
	
}

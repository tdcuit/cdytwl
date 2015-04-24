package com.cdytwl.common.pic.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;

import org.hibernate.Hibernate;

import com.cdytwl.common.domain.Pic;
import com.cdytwl.common.pic.service.PicManager;
import com.opensymphony.xwork2.ActionSupport;

public class PicAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private static final String UPLOADSUCCESS = "UPLOADSUCCESS";
	private static final String UPLOADFAILED = "UPLOADFAILED";
	private static final String OUTSUCCESS = "OUTSUCCESS";
	private static final String OUTFAILED = "OUTFAILED";
	private File file;
	private String picname;
	private String picdes;
	private long id;
	
	private PicManager picManager;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getPicname() {
		return picname;
	}

	public void setPicname(String picname) {
		this.picname = picname;
	}

	public String getPicdes() {
		return picdes;
	}

	public void setPicdes(String picdes) {
		this.picdes = picdes;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PicManager getPicManager() {
		return picManager;
	}

	public void setPicManager(PicManager picManager) {
		this.picManager = picManager;
	}
	
	public String upload(){
		try {
			FileInputStream in1 = new FileInputStream(file.getPath());
			Blob img1 = Hibernate.createBlob(in1);
			Pic pic = new Pic(img1, null, picname, picdes);
			if(picManager.addPic(pic)){
				return UPLOADSUCCESS;
			}
				return UPLOADFAILED;
		} catch (Exception e) {
			e.printStackTrace();
			return UPLOADFAILED;
		}
	}
	
}

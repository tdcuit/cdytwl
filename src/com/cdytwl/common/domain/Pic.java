package com.cdytwl.common.domain;

import java.sql.Blob;


/**
 * Pic entity. @author MyEclipse Persistence Tools
 */
public class Pic implements java.io.Serializable {
	// Fields    
	private static final long serialVersionUID = 1L;
	private long id;
    private Blob thumbnailpic;
    private Blob originalpic;
    private String picname;
    private String picdes;

   // Property accessors
    
   public long getId() {
       return this.id;
   }

   public void setId(long id) {
       this.id = id;
   }

   public Blob getThumbnailpic() {
       return this.thumbnailpic;
   }
   
   public void setThumbnailpic(Blob thumbnailpic) {
       this.thumbnailpic = thumbnailpic;
   }

   public Blob getOriginalpic() {
       return this.originalpic;
   }
   
   public void setOriginalpic(Blob originalpic) {
       this.originalpic = originalpic;
   }

   public String getPicname() {
       return this.picname;
   }
   
   public void setPicname(String picname) {
       this.picname = picname;
   }

   public String getPicdes() {
       return this.picdes;
   }
   
   public void setPicdes(String picdes) {
       this.picdes = picdes;
   }
    // Constructors

    /** default constructor */
    public Pic() {
    }

	public Pic(Blob thumbnailpic, Blob originalpic, String picname,
			String picdes) {
		super();
		this.thumbnailpic = thumbnailpic;
		this.originalpic = originalpic;
		this.picname = picname;
		this.picdes = picdes;
	}
}


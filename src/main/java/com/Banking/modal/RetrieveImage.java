package com.Banking.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CarTable")
public class RetrieveImage {
	
	@Id
	private int id;
	//@Column(name="car_image_path")
	private String carimagepath;
	//@Column(name="car_imagename")
	private String carimagename;
	//@Column(name="car_image_dis")
	private String carimagedis;
	
	
	public RetrieveImage() {
		
	}
	
	
	public RetrieveImage(String carimagepath, String carimagename, String carimagedis) {
		super();
		this.carimagepath = carimagepath;
		this.carimagename = carimagename;
		this.carimagedis = carimagedis;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	


	public String getCarimagepath() {
		return carimagepath;
	}


	public void setCarimagepath(String carimagepath) {
		this.carimagepath = carimagepath;
	}


	public String getCarimagename() {
		return carimagename;
	}


	public void setCarimagename(String carimagename) {
		this.carimagename = carimagename;
	}


	public String getCarimagedis() {
		return carimagedis;
	}


	public void setCarimagedis(String carimagedis) {
		this.carimagedis = carimagedis;
	}


	@Override
	public String toString() {
		return "RetrieveImage [id=" + id + ", carimagepath=" + carimagepath + ", carimagename=" + carimagename
				+ ", carimagedis=" + carimagedis + "]";
	}
	
	
	
	
	

}

package com.Banking.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="imageTable")
public class Car {
	
	@Id
	private int id;
	private String imagepath;	
	private String Itemnumber;	
	private String Itemdis;
	
	
	public Car() {
		
	}
	
	
	public Car(String imagepath,String Itemnumber, String Itemdis) {
		super();
		
		this.imagepath = imagepath;		
		this.Itemnumber = Itemnumber;
		this.Itemdis = Itemdis;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getImagepath() {
		return imagepath;
	}


	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}


	public String getItemnumber() {
		return Itemnumber;
	}


	public void setItemnumber(String itemnumber) {
		Itemnumber = itemnumber;
	}


	public String getItemdis() {
		return Itemdis;
	}


	public void setItemdis(String itemdis) {
		Itemdis = itemdis;
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", imagepath=" + imagepath + ", Itemnumber=" + Itemnumber + ", Itemdis=" + Itemdis
				+ "]";
	}
	
	
	
}

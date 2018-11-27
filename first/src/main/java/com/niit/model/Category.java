package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Category {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
 
  int categoryid;
	String categoryname;
	String categorydesc;
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCategorydesc() {
		return categorydesc;
	}
	public void setCategorydesc(String categorydesc) {
		this.categorydesc = categorydesc;
	}
	
	

}

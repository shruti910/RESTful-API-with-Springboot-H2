 package com.example.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
public class Hospital {
    
    	@Id
	private int id;
	  private String name;
	  private String city;
	  private double rating;
	  
	 
	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
      @Override
  public String toString() {
    return "Hospital [id=" + id + ", name=" + name + ", city=" + city + ", rating= "+ rating+ "]";
  }
	 

	}

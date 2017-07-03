 package br.com.giovannicaprio.RestaurantPooling.models;

import java.math.BigInteger;

public class Greeting {
	
	private BigInteger id;
	private String txt;
	
	public Greeting(){
		
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt; 
	}
	
	

}

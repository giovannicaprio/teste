package br.com.giovannicaprio.RestaurantPooling.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue
	@Column(name = "idrestaurant")
	private Integer id;
	private String name;
	
	private Date lasttimehere;
	
	private Integer votes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLastTimeHere() {
		return lasttimehere;
	}
	public void setLastTimeHere(Date lasttimehere) {
		this.lasttimehere = lasttimehere;
	}
	public Integer getVotes() {
		return votes;
	}
	public void setVotes(Integer votes) {
		this.votes = votes;
	}
	

}


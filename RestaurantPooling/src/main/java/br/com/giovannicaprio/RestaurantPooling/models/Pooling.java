package br.com.giovannicaprio.RestaurantPooling.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pooling {
	@Id
	@GeneratedValue
	@Column(name = "idpooling")
	private Integer idpooling;
	
	@Column(name = "idrestaurant")
	private Integer idrestaurant;
	
	private Date date;
	private Integer votes;
	public Integer getIdpooling() {
		return idpooling;
	}
	public void setIdpooling(Integer idpooling) {
		this.idpooling = idpooling;
	}
	public Integer getIdrestaurant() {
		return idrestaurant;
	}
	public void setIdrestaurant(Integer idrestaurant) {
		this.idrestaurant = idrestaurant;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getVotes() {
		return votes;
	}
	public void setVotes(Integer votes) {
		this.votes = votes;
	}
	
	


}

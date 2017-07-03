package br.com.giovannicaprio.RestaurantPooling.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Uservotes {
	@Id
	@GeneratedValue
	@Column(name = "iduservotes")
	private Integer id;
	
	@Column(name = "iduser")
	private Integer iduser;
	
	private Date date;
	private Boolean voted;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIduser() {
		return iduser;
	}
	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Boolean getVoted() {
		return voted;
	}
	public void setVoted(Boolean voted) {
		this.voted = voted;
	}
	

}

package com.mercadolibre.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EVENT_TABLE")
public class Event {

	private Integer id;
	private EventTypeEnum type;
	private Date date;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Id
	@Column(name = "EVENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	@Column(name="EVENT_TYPE")
	@Enumerated(EnumType.STRING)
	public EventTypeEnum getType() {
		return type;
	}

	public void setType(EventTypeEnum type) {
		this.type = type;
	}
	
	@Column(name ="CREATION_DATE")
	@Temporal(TemporalType.TIME)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}

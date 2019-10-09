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

@Entity
@Table(name = "INVOICE_TABLE")
public class Invoice {

	private Integer id;
	private Date creationDate;
	private Date expirationDate;
	private PeriodEnum period;
	
	@Id
	@Column(name = "INVOICE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "CREATION_DATE")
	public Date getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "EXPIRATION_DATE")
	public Date getExpirationDate() {
		return expirationDate;
	}
	
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	@Column(name ="PERIOD")
	@Enumerated(EnumType.STRING)
	public PeriodEnum getPeriod() {
		return period;
	}
	
	public void setPeriod(PeriodEnum period) {
		this.period = period;
	}

}

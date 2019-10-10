package com.mercadolibre.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CHARGE_TABLE")
public class Charge {
	
	private Integer id;
	private Float amount;
	private CurrencyEnum currency;
	private CategoryEnum category;
	private ChargeStatusEnum chargeStatus;
	private Event event;
	private List<Payment> payments;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Id
	@Column(name = "CHARGE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	
	@Column(name = "AMOUNT")
	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	@Enumerated(EnumType.STRING)
	public CurrencyEnum getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyEnum currency) {
		this.currency = currency;
	}
	
	@Enumerated(EnumType.STRING)
	public CategoryEnum getCategory() {
		return category;
	}

	public void setCategory(CategoryEnum category) {
		this.category = category;
	}

	@Column(name ="CHARGE_STATUS")
	@Enumerated(EnumType.STRING)
	public ChargeStatusEnum getChargeStatus() {
		return chargeStatus;
	}

	public void setChargeStatus(ChargeStatusEnum chargeStatus) {
		this.chargeStatus = chargeStatus;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EVENT_ID")
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@JoinTable(name = "CHARGES_PAYEMTS_REL",
		        joinColumns = @JoinColumn(name = "FK_CHARGE"),
		        inverseJoinColumns = @JoinColumn(name="FK_PAYMENT")
		     )
	@ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

}

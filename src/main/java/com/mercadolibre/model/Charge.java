package com.mercadolibre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHARGE_TABLE")
public class Charge {
	
	private Integer id;
	private Float amount;
	private CurrencyEnum currency;
	private CategoryEnumç category;
	private ChargeStatusEnum chargeStatus;
	
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
	public CategoryEnumç getCategory() {
		return category;
	}

	public void setCategory(CategoryEnumç category) {
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
}

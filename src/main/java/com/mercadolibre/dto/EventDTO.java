package com.mercadolibre.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class EventDTO {
	
	@NotNull
	@Range(min=1, max=100)
	private int eventId;
	
	@NotNull(message ="Debe ingresarun monto" )
	private float amount;
	
	@NotNull
	@Size(min = 1, message = "Debe ingresar una moneda ")
	private String currency;
	
	@NotNull
	@Size(min = 1, message = "Debe ingresar un tipo de evento ")
	private String eventType;
	
	@NotNull
	@Size(min = 1, message = "Debe ingresar una fecha")
	private String date;
	
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}

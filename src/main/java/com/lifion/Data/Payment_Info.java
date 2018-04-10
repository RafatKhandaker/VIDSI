package com.lifion.Data;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Payment_Info database table.
 * 
 */
@Entity
@NamedQuery(name="Payment_Info.findAll", query="SELECT p FROM Payment_Info p")
public class Payment_Info implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Payment_InfoPK id;

	private String billing_Address;

	private String payment_Type;

	//bi-directional many-to-one association to Subscriber
	@ManyToOne
	@JoinColumn(name="Id")
	private Subscriber subscriber;

	public Payment_Info() {
	}

	public Payment_InfoPK getId() {
		return this.id;
	}

	public void setId(Payment_InfoPK id) {
		this.id = id;
	}

	public String getBilling_Address() {
		return this.billing_Address;
	}

	public void setBilling_Address(String billing_Address) {
		this.billing_Address = billing_Address;
	}

	public String getPayment_Type() {
		return this.payment_Type;
	}

	public void setPayment_Type(String payment_Type) {
		this.payment_Type = payment_Type;
	}

	public Subscriber getSubscriber() {
		return this.subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

}
package com.lifion.Data;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Subscriber_Info database table.
 * 
 */
@Entity
@NamedQuery(name="Subscriber_Info.findAll", query="SELECT s FROM Subscriber_Info s")
public class Subscriber_Info implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String email;

	private String name;

	//bi-directional one-to-one association to Subscriber
	@OneToOne
	@JoinColumn(name="Id")
	private Subscriber subscriber;

	public Subscriber_Info() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subscriber getSubscriber() {
		return this.subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

}
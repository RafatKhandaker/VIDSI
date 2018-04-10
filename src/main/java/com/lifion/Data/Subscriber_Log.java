package com.lifion.Data;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Subscriber_Log database table.
 * 
 */
@Entity
@NamedQuery(name="Subscriber_Log.findAll", query="SELECT s FROM Subscriber_Log s")
public class Subscriber_Log implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Subscriber_LogPK id;

	@Lob
	private String times_Viewed;

	//bi-directional many-to-one association to Subscriber
	@ManyToOne
	@JoinColumn(name="Subscriber_Id")
	private Subscriber subscriber;

	public Subscriber_Log() {
	}

	public Subscriber_LogPK getId() {
		return this.id;
	}

	public void setId(Subscriber_LogPK id) {
		this.id = id;
	}

	public String getTimes_Viewed() {
		return this.times_Viewed;
	}

	public void setTimes_Viewed(String times_Viewed) {
		this.times_Viewed = times_Viewed;
	}

	public Subscriber getSubscriber() {
		return this.subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

}
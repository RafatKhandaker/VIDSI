package com.lifion.app;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Subscriber_Log database table.
 * 
 */
@Embeddable
public class Subscriber_LogPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String subscriber_Id;

	private String content_View_URI;

	public Subscriber_LogPK() {
	}
	public String getSubscriber_Id() {
		return this.subscriber_Id;
	}
	public void setSubscriber_Id(String subscriber_Id) {
		this.subscriber_Id = subscriber_Id;
	}
	public String getContent_View_URI() {
		return this.content_View_URI;
	}
	public void setContent_View_URI(String content_View_URI) {
		this.content_View_URI = content_View_URI;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Subscriber_LogPK)) {
			return false;
		}
		Subscriber_LogPK castOther = (Subscriber_LogPK)other;
		return 
			this.subscriber_Id.equals(castOther.subscriber_Id)
			&& this.content_View_URI.equals(castOther.content_View_URI);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.subscriber_Id.hashCode();
		hash = hash * prime + this.content_View_URI.hashCode();
		
		return hash;
	}
}
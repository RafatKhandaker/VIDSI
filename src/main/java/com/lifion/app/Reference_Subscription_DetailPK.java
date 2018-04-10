package com.lifion.app;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Reference_Subscription_Details database table.
 * 
 */
@Embeddable
public class Reference_Subscription_DetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	private int subscription_Tier;

	@Column(insertable=false, updatable=false)
	private String content_Providers;

	public Reference_Subscription_DetailPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSubscription_Tier() {
		return this.subscription_Tier;
	}
	public void setSubscription_Tier(int subscription_Tier) {
		this.subscription_Tier = subscription_Tier;
	}
	public String getContent_Providers() {
		return this.content_Providers;
	}
	public void setContent_Providers(String content_Providers) {
		this.content_Providers = content_Providers;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Reference_Subscription_DetailPK)) {
			return false;
		}
		Reference_Subscription_DetailPK castOther = (Reference_Subscription_DetailPK)other;
		return 
			(this.id == castOther.id)
			&& (this.subscription_Tier == castOther.subscription_Tier)
			&& this.content_Providers.equals(castOther.content_Providers);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.subscription_Tier;
		hash = hash * prime + this.content_Providers.hashCode();
		
		return hash;
	}
}
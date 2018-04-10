package com.lifion.app;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Reference_Subscription_Details database table.
 * 
 */
@Entity
@Table(name="Reference_Subscription_Details")
@NamedQuery(name="Reference_Subscription_Detail.findAll", query="SELECT r FROM Reference_Subscription_Detail r")
public class Reference_Subscription_Detail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Reference_Subscription_DetailPK id;

	private String provider_API;

	//bi-directional many-to-one association to Reference_Subscription_Type
	@ManyToOne
	@JoinColumn(name="Subscription_Tier")
	private Reference_Subscription_Type referenceSubscriptionType;

	public Reference_Subscription_Detail() {
	}

	public Reference_Subscription_DetailPK getId() {
		return this.id;
	}

	public void setId(Reference_Subscription_DetailPK id) {
		this.id = id;
	}

	public String getProvider_API() {
		return this.provider_API;
	}

	public void setProvider_API(String provider_API) {
		this.provider_API = provider_API;
	}

	public Reference_Subscription_Type getReferenceSubscriptionType() {
		return this.referenceSubscriptionType;
	}

	public void setReferenceSubscriptionType(Reference_Subscription_Type referenceSubscriptionType) {
		this.referenceSubscriptionType = referenceSubscriptionType;
	}

}
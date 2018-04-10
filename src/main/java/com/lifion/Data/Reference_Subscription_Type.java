package com.lifion.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Reference_Subscription_Type database table.
 * 
 */
@Entity
@NamedQuery(name="Reference_Subscription_Type.findAll", query="SELECT r FROM Reference_Subscription_Type r")
public class Reference_Subscription_Type implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private double subscription_Cost;

	private int subscription_Tier;

	//bi-directional many-to-one association to Reference_Subscription_Detail
	@OneToMany(mappedBy="referenceSubscriptionType")
	private List<Reference_Subscription_Detail> referenceSubscriptionDetails;

	//bi-directional many-to-one association to Subscriber
	@OneToMany(mappedBy="referenceSubscriptionType")
	private List<Subscriber> subscribers;

	public Reference_Subscription_Type() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSubscription_Cost() {
		return this.subscription_Cost;
	}

	public void setSubscription_Cost(double subscription_Cost) {
		this.subscription_Cost = subscription_Cost;
	}

	public int getSubscription_Tier() {
		return this.subscription_Tier;
	}

	public void setSubscription_Tier(int subscription_Tier) {
		this.subscription_Tier = subscription_Tier;
	}

	public List<Reference_Subscription_Detail> getReferenceSubscriptionDetails() {
		return this.referenceSubscriptionDetails;
	}

	public void setReferenceSubscriptionDetails(List<Reference_Subscription_Detail> referenceSubscriptionDetails) {
		this.referenceSubscriptionDetails = referenceSubscriptionDetails;
	}

	public Reference_Subscription_Detail addReferenceSubscriptionDetail(Reference_Subscription_Detail referenceSubscriptionDetail) {
		getReferenceSubscriptionDetails().add(referenceSubscriptionDetail);
		referenceSubscriptionDetail.setReferenceSubscriptionType(this);

		return referenceSubscriptionDetail;
	}

	public Reference_Subscription_Detail removeReferenceSubscriptionDetail(Reference_Subscription_Detail referenceSubscriptionDetail) {
		getReferenceSubscriptionDetails().remove(referenceSubscriptionDetail);
		referenceSubscriptionDetail.setReferenceSubscriptionType(null);

		return referenceSubscriptionDetail;
	}

	public List<Subscriber> getSubscribers() {
		return this.subscribers;
	}

	public void setSubscribers(List<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}

	public Subscriber addSubscriber(Subscriber subscriber) {
		getSubscribers().add(subscriber);
		subscriber.setReferenceSubscriptionType(this);

		return subscriber;
	}

	public Subscriber removeSubscriber(Subscriber subscriber) {
		getSubscribers().remove(subscriber);
		subscriber.setReferenceSubscriptionType(null);

		return subscriber;
	}

}
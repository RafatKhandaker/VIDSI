package com.lifion.app;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Reference_Content_Limitation database table.
 * 
 */
@Entity
@NamedQuery(name="Reference_Content_Limitation.findAll", query="SELECT r FROM Reference_Content_Limitation r")
public class Reference_Content_Limitation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String content_Provider;

	private int limitations;

	//bi-directional many-to-one association to Reference_Subscription_Detail
	@OneToMany(mappedBy="referenceContentLimitation")
	private List<Reference_Subscription_Detail> referenceSubscriptionDetails;

	public Reference_Content_Limitation() {
	}

	public String getContent_Provider() {
		return this.content_Provider;
	}

	public void setContent_Provider(String content_Provider) {
		this.content_Provider = content_Provider;
	}

	public int getLimitations() {
		return this.limitations;
	}

	public void setLimitations(int limitations) {
		this.limitations = limitations;
	}

	public List<Reference_Subscription_Detail> getReferenceSubscriptionDetails() {
		return this.referenceSubscriptionDetails;
	}

	public void setReferenceSubscriptionDetails(List<Reference_Subscription_Detail> referenceSubscriptionDetails) {
		this.referenceSubscriptionDetails = referenceSubscriptionDetails;
	}

	public Reference_Subscription_Detail addReferenceSubscriptionDetail(Reference_Subscription_Detail referenceSubscriptionDetail) {
		getReferenceSubscriptionDetails().add(referenceSubscriptionDetail);
		referenceSubscriptionDetail.setReferenceContentLimitation(this);

		return referenceSubscriptionDetail;
	}

	public Reference_Subscription_Detail removeReferenceSubscriptionDetail(Reference_Subscription_Detail referenceSubscriptionDetail) {
		getReferenceSubscriptionDetails().remove(referenceSubscriptionDetail);
		referenceSubscriptionDetail.setReferenceContentLimitation(null);

		return referenceSubscriptionDetail;
	}

}
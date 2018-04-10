package com.lifion.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Subscriber database table.
 * 
 */
@Entity
@NamedQuery(name="Subscriber.findAll", query="SELECT s FROM Subscriber s")
public class Subscriber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String subscriber_Id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date signUp_Date;

	@Temporal(TemporalType.TIMESTAMP)
	private Date subscription_Date;

	private byte subscription_Requested;

	private String subscription_Status;

	//bi-directional many-to-one association to Payment_Info
	@OneToMany(mappedBy="subscriber")
	private List<Payment_Info> paymentInfos;

	//bi-directional many-to-one association to Reference_Subscription_Type
	@ManyToOne
	@JoinColumn(name="Subscription_Type")
	private Reference_Subscription_Type referenceSubscriptionType;

	//bi-directional one-to-one association to Subscriber_Info
	@OneToOne(mappedBy="subscriber")
	private Subscriber_Info subscriberInfo;

	//bi-directional many-to-one association to Subscriber_Log
	@OneToMany(mappedBy="subscriber")
	private List<Subscriber_Log> subscriberLogs;

	public Subscriber() {
	}

	public String getSubscriber_Id() {
		return this.subscriber_Id;
	}

	public void setSubscriber_Id(String subscriber_Id) {
		this.subscriber_Id = subscriber_Id;
	}

	public Date getSignUp_Date() {
		return this.signUp_Date;
	}

	public void setSignUp_Date(Date signUp_Date) {
		this.signUp_Date = signUp_Date;
	}

	public Date getSubscription_Date() {
		return this.subscription_Date;
	}

	public void setSubscription_Date(Date subscription_Date) {
		this.subscription_Date = subscription_Date;
	}

	public byte getSubscription_Requested() {
		return this.subscription_Requested;
	}

	public void setSubscription_Requested(byte subscription_Requested) {
		this.subscription_Requested = subscription_Requested;
	}

	public String getSubscription_Status() {
		return this.subscription_Status;
	}

	public void setSubscription_Status(String subscription_Status) {
		this.subscription_Status = subscription_Status;
	}

	public List<Payment_Info> getPaymentInfos() {
		return this.paymentInfos;
	}

	public void setPaymentInfos(List<Payment_Info> paymentInfos) {
		this.paymentInfos = paymentInfos;
	}

	public Payment_Info addPaymentInfo(Payment_Info paymentInfo) {
		getPaymentInfos().add(paymentInfo);
		paymentInfo.setSubscriber(this);

		return paymentInfo;
	}

	public Payment_Info removePaymentInfo(Payment_Info paymentInfo) {
		getPaymentInfos().remove(paymentInfo);
		paymentInfo.setSubscriber(null);

		return paymentInfo;
	}

	public Reference_Subscription_Type getReferenceSubscriptionType() {
		return this.referenceSubscriptionType;
	}

	public void setReferenceSubscriptionType(Reference_Subscription_Type referenceSubscriptionType) {
		this.referenceSubscriptionType = referenceSubscriptionType;
	}

	public Subscriber_Info getSubscriberInfo() {
		return this.subscriberInfo;
	}

	public void setSubscriberInfo(Subscriber_Info subscriberInfo) {
		this.subscriberInfo = subscriberInfo;
	}

	public List<Subscriber_Log> getSubscriberLogs() {
		return this.subscriberLogs;
	}

	public void setSubscriberLogs(List<Subscriber_Log> subscriberLogs) {
		this.subscriberLogs = subscriberLogs;
	}

	public Subscriber_Log addSubscriberLog(Subscriber_Log subscriberLog) {
		getSubscriberLogs().add(subscriberLog);
		subscriberLog.setSubscriber(this);

		return subscriberLog;
	}

	public Subscriber_Log removeSubscriberLog(Subscriber_Log subscriberLog) {
		getSubscriberLogs().remove(subscriberLog);
		subscriberLog.setSubscriber(null);

		return subscriberLog;
	}

}
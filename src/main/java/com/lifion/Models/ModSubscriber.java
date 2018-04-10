package com.lifion.Models;

import java.time.LocalDateTime;
import java.util.UUID;

import com.lifion.Data.Subscriber;

@SuppressWarnings("unused")
public class ModSubscriber extends Subscriber{
	private static final long serialVersionUID = 2057498160131472239L;

	private UUID id;
	private LocalDateTime signUpDate;
	private String subscriptionType;
	private boolean subscriptionRequested;
	private LocalDateTime lastSubscriptionDate;
	private String subscriptionStatus;
	
	
	public ModSubscriber(
			UUID id, 
			LocalDateTime signUpDate, 
			String subscriptionType, 
			boolean subscriptionRequested, 
			LocalDateTime lastSubscriptionDate,
			String subscriptionStatus
			) {
		this.id = id;
		this.signUpDate = signUpDate;
		this.subscriptionType = subscriptionType;
		this.subscriptionRequested = subscriptionRequested;
		this.lastSubscriptionDate = lastSubscriptionDate;
		this.subscriptionStatus = subscriptionStatus;
	}
	
	public UUID getId() { return this.id; }
}

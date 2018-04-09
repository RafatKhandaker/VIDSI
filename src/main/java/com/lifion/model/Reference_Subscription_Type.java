package com.lifion.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Reference.Subscription_Type")
public class Reference_Subscription_Type implements Serializable {
	
	private static final long serialVersionUID = 6786782977812323336L;
	
	@Id
	private String subscriptionType;
	
	@OneToMany
	@JoinColumn(
			name="Subscription_Tier",
			referencedColumnName = "Content_Providers"
			)
	@Column(name = "Subscription_Tier")
	private int subscriptionTier;
	
	@Column(name = "Subscription_Cost")
	private long subscriptionCost;
}

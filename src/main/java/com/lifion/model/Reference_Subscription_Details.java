package com.lifion.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Reference.Subscription_Details" )
public class Reference_Subscription_Details implements Serializable{

	private static final long serialVersionUID = -8099520355484020701L;

	@Id
	private long id;
	
	@Id
	@Column( name = "Subscription_Tier" ) 
	private int subscriptionTier;
	
	@Id
	@Column( name = "Content_Providers" )
	private String contentProviders;
	
	@Column( name = "Provider_API")
	private String providerAPI;
	
}

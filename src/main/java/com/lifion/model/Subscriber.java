package com.lifion.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Subscriber")
public class Subscriber implements Serializable{

	private static final long serialVersionUID = -6176109338461363083L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID subscriberId;
	
	@Column(name = "SignUp_Date")
	private LocalDateTime signUpDate;
	
	@OneToMany
	@JoinColumn(
			name = "Subscription_Id", 
			referencedColumnName = "Id"
			)
	@Column(name = "Subscription_Type")
	private String subscriptionType;
	
	@Column(name = "Subscription_Requested")
	private String subscriptionRequested;
	
	@Column(name = "Subscription_Date")
	private LocalDateTime subscriptionDate;
	
	@Column(name = "Subscription_Status")
	private String subscriptionStatus;
	
}

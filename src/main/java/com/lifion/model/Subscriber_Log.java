package com.lifion.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Subscriber.Log")
public class Subscriber_Log implements Serializable{

	private static final long serialVersionUID = 6724406565912264888L;

	@PrimaryKeyJoinColumn(
			name = "Subscriber_Id", 
			referencedColumnName = "Subscriber_Id"
			)
	private UUID subscriberId;
	
	@Column(name = "Content_Viewed_URI")
	private String contentViewedURI;
	
	@Column(name = "Times_Viwed")
	private long timesViewed;
}

package com.lifion.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Subscriber.Info")
public class Subscriber_Info implements Serializable{

	private static final long serialVersionUID = 4602766966134740924L;

	@OneToOne
	@PrimaryKeyJoinColumn( 
			name = "Id", 
			referencedColumnName = "Subscriber_Id"
			)
	private UUID id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Email")
	private String email;
}

package com.lifion.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Check.Data")
public class Check_Data implements Serializable {
	
	private static final long serialVersionUID = -5508783998070634149L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	@PrimaryKeyJoinColumn(
			name="Process_Id", 
			referencedColumnName="Payment_Process_Id"
			)
	@Column(name = "Process_Id")
	private UUID processId;
	
	@Column(name = "Routing_Number")
	private long routingNumber;
	
	@Column(name = "Account_Number")
	private long accountNumber;
	
	protected Check_Data() {}
	
	
}

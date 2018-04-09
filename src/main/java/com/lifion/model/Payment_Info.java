package com.lifion.model;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Payment.Info")
public class Payment_Info implements Serializable{
	
	private static final long serialVersionUID = 6859379433583648196L;

	@Id
	private UUID id;
	
	@Column(name = "Billing_Address")
	private String billingAddress;
	
	@Column(name = "Payment_Type")
	private String paymentType;
	
	@Id
	@Column(name = "Payment_Process_Id")
	private String paymentProcessId;
	
	protected Payment_Info() {}

}

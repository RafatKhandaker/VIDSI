package com.lifion.model;

import java.io.Serializable;
import java.time.LocalDateTime;
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
@Table(name = "Credit.Data")
public class Credit_Data implements Serializable {

	private static final long serialVersionUID = -5083127077759682204L;

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
	
	@Column(name = "Account_Number")
	private long accountNumber;
	
	@Column(name = "CVS_Number")
	private long cvsNumber;
	
	@Column(name = "Expiration_Date")
	private LocalDateTime date;
	
	protected Credit_Data() {}
	

}

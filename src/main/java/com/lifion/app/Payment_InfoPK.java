package com.lifion.app;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Payment_Info database table.
 * 
 */
@Embeddable
public class Payment_InfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String id;

	private String payment_Process_Id;

	public Payment_InfoPK() {
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPayment_Process_Id() {
		return this.payment_Process_Id;
	}
	public void setPayment_Process_Id(String payment_Process_Id) {
		this.payment_Process_Id = payment_Process_Id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Payment_InfoPK)) {
			return false;
		}
		Payment_InfoPK castOther = (Payment_InfoPK)other;
		return 
			this.id.equals(castOther.id)
			&& this.payment_Process_Id.equals(castOther.payment_Process_Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id.hashCode();
		hash = hash * prime + this.payment_Process_Id.hashCode();
		
		return hash;
	}
}
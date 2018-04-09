package com.lifion.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Reference.Content_Limitations")
public class Reference_Content_Limitations implements Serializable {

	private static final long serialVersionUID = -1293892978562874140L;

	@OneToMany
	@PrimaryKeyJoinColumn( 
			name = "Content_Provider", 
			referencedColumnName = "Content_Providers"
			)
	@Column(name = "Content_Provider")
	private String contentProvider;
	
	@Column(name = "Limitations")
	private int limitations;
}

package com.lifion.Models;

import java.util.UUID;

import com.lifion.Data.Subscriber_Info;

@SuppressWarnings("unused")
public class ModSubscriberInfo extends Subscriber_Info{
	private static final long serialVersionUID = 7815237638767177297L;

	private UUID id;
	private String name;
	private String email;
	
	public ModSubscriberInfo(UUID id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public String getEmail() { return this.email; }
}

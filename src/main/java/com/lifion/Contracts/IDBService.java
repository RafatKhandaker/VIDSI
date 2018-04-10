package com.lifion.Contracts;

import java.util.List;
import java.util.UUID;

import com.lifion.Models.ModSubscriberInfo;
import com.lifion.Models.ModSubscriber;

public interface  IDBService {

	public List<ModSubscriber> retrieveAllExpiredAccounts();
	
	public ModSubscriberInfo retrieveSubscriberInfo( UUID subscriberId );
}

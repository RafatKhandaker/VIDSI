package com.lifion.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.lifion.Contracts.IDBService;
import com.lifion.Models.ModSubscriber;
import com.lifion.Models.ModSubscriberInfo;

@Component
public class DBService implements IDBService {

	private ModSubscriber testSubscriber1;
	private ModSubscriber testSubscriber2;
	private ModSubscriber testSubscriber3;
	private ModSubscriber testSubscriber4;
	private ModSubscriber testSubscriber5;

	@Override
	public List<ModSubscriber> retrieveAllExpiredAccounts() {
		List<ModSubscriber> result= new ArrayList<>();
		testSubscriber1 = new ModSubscriber(UUID.randomUUID(), LocalDateTime.now(),"Free", true, LocalDateTime.now(), "Expired");
		testSubscriber2 = new ModSubscriber(UUID.randomUUID(), LocalDateTime.now(),"ProRate1", false, LocalDateTime.now(), "Expired");
		testSubscriber3 = new ModSubscriber(UUID.randomUUID(), LocalDateTime.now(),"ProRate2", true, LocalDateTime.now(), "Expired");
		testSubscriber4 = new ModSubscriber(UUID.randomUUID(), LocalDateTime.now(),"ProRate3", false, LocalDateTime.now(), "Expired");
		testSubscriber5 = new ModSubscriber(UUID.randomUUID(), LocalDateTime.now(),"Free", false, LocalDateTime.now(), "Expired");
		
		result.add(testSubscriber1);
		result.add(testSubscriber2); 
		result.add(testSubscriber3); 
		result.add(testSubscriber4); 
		result.add(testSubscriber5); 

		return result;
	}

	@Override
	public ModSubscriberInfo retrieveSubscriberInfo(UUID subscriberId) {
		// TODO Auto-generated method stub
		return null;
	}

}

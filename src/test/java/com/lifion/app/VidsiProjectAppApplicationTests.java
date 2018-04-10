package com.lifion.app;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lifion.Contracts.IDBService;
import com.lifion.Contracts.INotificationService;
import com.lifion.Models.ModSubscriber;
import com.lifion.Models.ModSubscriberInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VidsiProjectAppApplicationTests {

	@Autowired
	IDBService DBService;

	@Autowired
	INotificationService notifyService;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void NotifyExpiredAccountsTest() {
		List<ModSubscriber> expiredAccounts = DBService.retrieveAllExpiredAccounts();
		
		for (ModSubscriber subscriber : expiredAccounts) {
			ModSubscriberInfo subscriberInfo = DBService.retrieveSubscriberInfo(subscriber.getId());
			notifyService.notifyExpiredAccounts(subscriberInfo.getEmail());
		}
		
		Assert.assertTrue(true);
		
	}
	

}

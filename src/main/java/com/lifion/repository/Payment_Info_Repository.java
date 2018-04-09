package com.lifion.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.lifion.model.Payment_Info;


public interface Payment_Info_Repository extends CrudRepository<Payment_Info, UUID>{
	
}


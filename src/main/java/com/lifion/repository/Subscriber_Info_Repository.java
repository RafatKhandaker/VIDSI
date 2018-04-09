package com.lifion.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.lifion.model.Subscriber_Info;

public interface Subscriber_Info_Repository extends CrudRepository<Subscriber_Info, UUID> {

}

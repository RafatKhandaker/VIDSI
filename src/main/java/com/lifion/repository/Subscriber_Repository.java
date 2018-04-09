package com.lifion.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.lifion.model.Subscriber;

public interface Subscriber_Repository extends CrudRepository<Subscriber, UUID> {

}

package com.lifion.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.lifion.model.Subscriber_Log;

public interface Subscriber_Log_Repository extends CrudRepository<Subscriber_Log, UUID> {

}

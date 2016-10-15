package com.springbootex.cass.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.springbootex.cass.model.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, UUID> {
}
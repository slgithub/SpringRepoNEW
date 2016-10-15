package com.springbootex;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springbootex.cass.model.Hotel;
import com.springbootex.cass.repositories.HotelRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringbootexApplication.class)
public class SampleCassandraApplicationTest {
	
	@Autowired
	private HotelRepository hotelRepository;

	@Test
	public void repositoryCrudOperations() {
		Hotel sample = sampleHotel();
		this.hotelRepository.save(sample);
		Hotel savedHotel = this.hotelRepository.findOne(sample.getId());
		assertThat(savedHotel.getName(), equalTo("Sample Hotel"));
		this.hotelRepository.delete(savedHotel);
	}

	private Hotel sampleHotel() {
		Hotel hotel = new Hotel();
		hotel.setId(UUID.randomUUID());
		hotel.setName("Sample Hotel");
		hotel.setAddress("Sample Address");
		hotel.setZip("8764");
		return hotel;
	}
}
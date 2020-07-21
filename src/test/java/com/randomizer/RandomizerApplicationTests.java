package com.randomizer;

import com.randomizer.controllers.RandomAddressController;
import com.randomizer.models.Address;
import com.randomizer.services.RandomAddressService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class RandomizerApplicationTests {

	@Autowired
	RandomAddressService randomAddressService;

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("Checking that house number consists of only digits")
	public void checkControllerResponse() {
		Address address = randomAddressService.generateAddress();
		assertThat(address.getHouse(), matchesPattern("\\d+"));
	}

	@Test
	@DisplayName("Checking that house number consists of only digits")
	public void checkHouseNumberFormat() {
		Address address = randomAddressService.generateAddress();
		assertThat(address.getHouse(), matchesPattern("\\d+"));
	}

	@Test
	@DisplayName("Checking that state code has at least 2 alpha characters")
	public void checkStateCodeFormat() {
		Address address = randomAddressService.generateAddress();
		assertThat(String.valueOf(address.getStateCode()), matchesPattern("[A-Z]{2,}"));
	}

	@Test
	@DisplayName("Checking state format")
	public void checkStateFormat() {
		Address address = randomAddressService.generateAddress();
		assertThat(address.getState(), matchesPattern("[a-zA-Z]+"));
	}

	@Test
	@DisplayName("Checking if code is positive")
	public void checkPostalCodeIsPositive() {
		Address address = randomAddressService.generateAddress();
		assertThat(address.getPostalCode(), greaterThan(0));
	}

	@Test
	@DisplayName("Checking if countryCode is matching ISO 3166-1 alpha-3 code format")
	public void checkCountryCodeFormat() {
		Address address = randomAddressService.generateAddress();
		assertThat(address.getCountryCode(), matchesPattern("[A-Z]{3}"));
	}

}

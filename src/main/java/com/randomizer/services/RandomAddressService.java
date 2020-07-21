package com.randomizer.services;

import com.randomizer.models.Address;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class RandomAddressService {
    private static final Logger logger = LogManager.getLogger(RandomAddressService.class);

    public Address generateAddress() {
        Address address = new Address();
        setRandomCountry(address);
        setRandomCounty(address);
        setRandomHouseNumber(address);
        setRandomPostalCode(address);
        setRandomState(address);
        setRandomStreetNumber(address);
        setRandomCity(address);
        logger.info(address);
        return address;
    }

    private void setRandomStreetNumber(Address address) {
        Random random = new Random();
        int streetNumber = random.nextInt(3000) + 1;
        String streetAddress = streetNumber + " " + getRandomStreet();
        address.setStreet(streetAddress);

    }

    public void setRandomState(Address address) {
        String[] arr = getRandomDataFromTheFile("states.txt").split(", ");
        address.setState(arr[0]);
        address.setStateCode(arr[1]);
    }

    private void setRandomPostalCode(Address address) {
        Random random = new Random();
        address.setPostalCode(random.nextInt(10000) + 10000);
    }

    public void setRandomCountry(Address address) {
        String[] arr = getRandomDataFromTheFile("countries.txt").split(", ");
        address.setCountry(arr[0]);
        address.setCountryCode(arr[1]);
    }

    private void setRandomCounty(Address address) {
        String county = getRandomDataFromTheFile("counties.txt");
        address.setCounty(county);
    }

    private void setRandomHouseNumber(Address address) {
        Random random = new Random();
        address.setHouse(String.valueOf(random.nextInt(1000) + 10));
    }

    private String getRandomStreet() {
        return getRandomDataFromTheFile("streets.txt");
    }

    private void setRandomCity(Address address) {
        String city = getRandomDataFromTheFile("cities.txt");
        address.setCity(city);
    }

    private String getRandomDataFromTheFile(String fileName) {
        List<String> data = new ArrayList<>();
        try {
            data.addAll(Files.readAllLines(Path.of("src/main/resources/data/" + fileName)));
        } catch (Exception e) {
            logger.error(e);
            e.printStackTrace();
        }
        Random random = new Random();
        return data.get(random.nextInt(data.size()));
    }


}

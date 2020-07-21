package com.randomizer.controllers;

import com.randomizer.models.Address;
import com.randomizer.services.RandomAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/randomizer")
public class RandomAddressController {

    @Autowired
    RandomAddressService randomAddressService;

    @GetMapping("/address")
    public Address getRandomAddress() {
        return randomAddressService.generateAddress();
    }
}

package com.randomizer.models;

import java.util.Objects;

public class Address {
    private String house;
    private String street;
    private int postalCode;
    private String city;
    private String county;
    private String state;
    private String stateCode;
    private String country;
    private String countryCode;

    public Address() {
    }

    public Address(String street, String house, String city, String state, String stateCode, int postalCode, String country, String countryCode, String county) {
        this.street = street;
        this.house = house;
        this.city = city;
        this.state = state;
        this.stateCode = stateCode;
        this.postalCode = postalCode;
        this.country = country;
        this.countryCode = countryCode;
        this.county = county;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return postalCode == address.postalCode &&
                street.equals(address.street) &&
                house.equals(address.house) &&
                city.equals(address.city) &&
                state.equals(address.state) &&
                stateCode.equals(address.stateCode) &&
                country.equals(address.country) &&
                countryCode.equals(address.countryCode) &&
                county.equals(address.county);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, house, city, state, stateCode, postalCode, country, countryCode, county);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", stateCode='" + stateCode + '\'' +
                ", postalCode=" + postalCode +
                ", country='" + country + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}

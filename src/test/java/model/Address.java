package model;

import com.github.javafaker.Faker;

public class Address {

    private final String country;
    private final String name;
    private final String mobileNumber;
    private final String zipCode;
    private final String address;
    private final String city;
    private final String state;


    public Address() {
        var faker = new Faker();
        country = faker.address().country();
        name = faker.name().name();
        mobileNumber = faker.number().digits(10);
        zipCode = faker.number().digits(5);
        address = faker.address().fullAddress();
        city = faker.address().city();
        state = faker.address().state();
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}

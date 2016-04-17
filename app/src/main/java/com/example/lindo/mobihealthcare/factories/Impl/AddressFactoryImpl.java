package com.example.lindo.mobihealthcare.factories.Impl;


import com.example.lindo.mobihealthcare.domain.Address;
import com.example.lindo.mobihealthcare.factories.AddressFactory;

/**
 * Created by LILO on 2016/04/07.
 */
public class AddressFactoryImpl implements AddressFactory {

    private static AddressFactoryImpl addressFactory = null;

    public AddressFactoryImpl() {
    }

    public static  AddressFactoryImpl getInstance()
    {
        if(addressFactory == null)
            addressFactory = new AddressFactoryImpl();
        return addressFactory;
    }

    public Address createAddress(int streetNumber, String streetName, String town, String city, int zipCode) {
        Address address = new Address.Builder().streetNumber(streetNumber).streetName(streetName).town(town)
                                    .city(city).zipCode(zipCode).build();
        return address;
    }
}

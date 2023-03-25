package com.sda;

import com.sda.provider.CountryProvider;
import com.sda.provider.CountryProviderImpl;

public class Main {

    public static void main(String[] args) {
        CountryProvider countryProvider = new CountryProviderImpl();
        countryProvider.getAllCountries().forEach(System.out::println);
    }
}


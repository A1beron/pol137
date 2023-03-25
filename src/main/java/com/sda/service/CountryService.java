package com.sda.service;

import com.sda.model.Country;
import com.sda.provider.CountryProvider;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class CountryService {

    private CountryProvider countryProvider;

    public Optional<Country> findCountryByName(String name) {
        return countryProvider.getAllCountries().stream()
                .filter(country -> country.getName().equals(name))
                .findFirst();
    }

}

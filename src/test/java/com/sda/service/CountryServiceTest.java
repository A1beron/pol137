package com.sda.service;

import com.sda.model.Country;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class CountryServiceTest {

    Country testCountry1 = new Country("Poland", "PL", "PLN");
    Country testCountry2 = new Country("France", "FR", "EUR");

    List<Country> countriesList = List.of(
            testCountry1,
            testCountry2
    );

    @Test
    void shouldReturnCountryBySelectedName() {
        //given
        CountryService countryService = new CountryService(
                () -> countriesList
        );
        //when
        Optional<Country> result = countryService.findCountryByName("France");
        //then
        assertThat(result.get()).isEqualTo(testCountry2);
    }

}
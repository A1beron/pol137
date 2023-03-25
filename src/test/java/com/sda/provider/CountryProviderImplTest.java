package com.sda.provider;


import com.sda.model.Country;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CountryProviderImplTest {

    List<Country> expectedResult = List.of(
            new Country("Poland", "PL","PLN"),
            new Country("France", "FR","EUR")
    );

    @Test
    void shouldReturnAllCountriesFromFile() {
        //given
        CountryProvider countryProvider = new CountryProviderImpl("src/test/resources/countries_test");
        //when
        List<Country> result = countryProvider.getAllCountries();
        //then
        assertThat(result).containsAll(expectedResult);
    }

    @Test
    void test(){
        CountryProvider countryProvider = () -> expectedResult;
        CountryProvider countryProvider2 = new CountryProviderTest();
        countryProvider.getAllCountries();

    }

    class CountryProviderTest implements CountryProvider {
        @Override
        public List<Country> getAllCountries() {
            return expectedResult;
        }
    }

}
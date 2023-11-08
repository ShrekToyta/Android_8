package com.myserver.demos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class MyRestController {
    private List<City> cities = new ArrayList<>();

    public MyRestController() {
        cities.addAll(
                List.of(
                        new City("Kazan", 25),
                        new City("Agryz", 27),
                        new City("Chelny", 27)
                )
        );
    }


    @GetMapping("/cities")
    Iterable<City> getCities() {return cities;}

    @GetMapping("/cities/{id}")
    Optional<City> getCityById(@PathVariable String id){
        for (City c: cities){
            if (c.getId().equals(id)){
                return Optional.of(c);
            }
        }

        return Optional.empty();
    }

    @GetMapping("/temps")
    Iterable<Integer> getTemps() {return cities.stream().map(City::getTemp).toList();}


}


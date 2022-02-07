package com.task.cities.service;

import com.task.cities.model.City;

import java.util.List;

public interface CityService {

    List<City> getAll(int limit, int offset);

    City getByName(String name);

    City edit(City city);
}

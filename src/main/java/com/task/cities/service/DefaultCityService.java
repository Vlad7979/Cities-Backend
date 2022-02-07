package com.task.cities.service;

import com.task.cities.model.City;
import com.task.cities.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DefaultCityService implements CityService {

    private CityRepository repository;

    @Override
    public List<City> getAll(int limit, int offset) {
        return repository.findAll(Pageable.ofSize(limit).withPage(offset)).getContent();
    }

    @Override
    public City getByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public City edit(City city) {
        City result = repository.findById(city.getId()).get();
        result.setName(city.getName());
        result.setPhoto(city.getPhoto());
        repository.save(result);
        return result;
    }
}

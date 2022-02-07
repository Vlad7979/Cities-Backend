package com.task.cities.controller;

import com.task.cities.model.City;
import com.task.cities.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/city")
@CrossOrigin("*")
@AllArgsConstructor
public class CityController {

    private CityService service;

    @GetMapping("/get")
    public List<City> getAll(@RequestParam("limit") int limit, @RequestParam("page") int page) {
        return service.getAll(limit, page);
    }

    @GetMapping("/get-by-name")
    public City getByName(@RequestParam("name") String name) {
        return service.getByName(name);
    }

    @PutMapping("/edit")
    public City edit(@RequestBody City city) {
        return service.edit(city);
    }
}
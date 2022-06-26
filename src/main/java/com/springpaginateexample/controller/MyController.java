package com.springpaginateexample.controller;

import com.springpaginateexample.model.Country;
import com.springpaginateexample.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private ICountryService countryService;

    @GetMapping("/countries/{pageNo}/{pageSize}")
    public List<Country> getPaginatedCountries(@PathVariable int pageNo,
                                               @PathVariable int pageSize) {

        return countryService.findPaginated(pageNo, pageSize);
    }
}

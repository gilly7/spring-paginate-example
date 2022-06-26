package com.springpaginateexample.service;


import com.springpaginateexample.model.Country;

import java.util.List;

public interface ICountryService {

    List<Country> findPaginated(int pageNo, int pageSize);
}

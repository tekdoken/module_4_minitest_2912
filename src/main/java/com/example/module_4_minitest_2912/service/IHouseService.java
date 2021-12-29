package com.example.module_4_minitest_2912.service;

import com.example.module_4_minitest_2912.model.House;

public interface IHouseService extends IGeneralService<House>{
    Iterable<House> findByBathroomGreaterThanEqual(int bathroom);
    Iterable<House> findAllByOrderByName();
}

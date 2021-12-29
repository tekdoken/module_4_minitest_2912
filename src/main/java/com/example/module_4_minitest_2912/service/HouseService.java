package com.example.module_4_minitest_2912.service;

import com.example.module_4_minitest_2912.model.House;
import com.example.module_4_minitest_2912.repository.IHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HouseService implements IHouseService {
    @Autowired
    IHouseRepository iHouseRepository;

    @Override
    public Iterable<House> findAll() {
        return iHouseRepository.findAll();
    }

    @Override
    public Optional<House> findById(Long id) {
        return iHouseRepository.findById(id);
    }

    @Override
    public void save(House house) {
        iHouseRepository.save(house);
    }

    @Override
    public void remote(Long id) {
        iHouseRepository.deleteById(id);
    }

    @Override
    public Iterable<House> findByBathroomGreaterThanEqual(int bathroom) {
        return iHouseRepository.findByBathroomGreaterThanEqual(bathroom);
    }

    @Override
    public Iterable<House> findAllByOrderByName() {
        return iHouseRepository.findAllByOrderByName();
    }
}

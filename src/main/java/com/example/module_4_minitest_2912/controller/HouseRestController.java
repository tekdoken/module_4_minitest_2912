package com.example.module_4_minitest_2912.controller;

import com.example.module_4_minitest_2912.model.House;
import com.example.module_4_minitest_2912.service.ICategoryService;
import com.example.module_4_minitest_2912.service.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/houses")
public class HouseRestController {
    @Autowired
    ICategoryService iCategoryService;
    @Autowired
    IHouseService iHouseService;
    @GetMapping("/list")
    public ResponseEntity<Iterable<House>> list(){
        return new ResponseEntity<>(iHouseService.findAll(), HttpStatus.OK);
    }
}

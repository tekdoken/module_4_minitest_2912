package com.example.module_4_minitest_2912.controller;

import com.example.module_4_minitest_2912.model.Category;
import com.example.module_4_minitest_2912.model.House;
import com.example.module_4_minitest_2912.service.CategoryService;
import com.example.module_4_minitest_2912.service.ICategoryService;
import com.example.module_4_minitest_2912.service.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/houses")
public class HouseRestController {
    @Autowired
    ICategoryService iCategoryService;
    @Autowired
    IHouseService iHouseService;

    @GetMapping("/list")
    public ResponseEntity<Iterable<House>> list() {
        return new ResponseEntity<>(iHouseService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/listBathroom")
    public ResponseEntity<Iterable<House>> listBathroom() {
        return new ResponseEntity<>(iHouseService.findByBathroomGreaterThanEqual(3), HttpStatus.OK);
    }

    @GetMapping("/category")
    public ResponseEntity<Iterable<Category>> cateogry() {
        return new ResponseEntity<>(iCategoryService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<House> add(@RequestBody House house) {
        iHouseService.save(house);
        return new ResponseEntity<>(house, HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Optional<House>> edit(@PathVariable Long id, @RequestBody House house) {
        Optional<House> houseOptional = iHouseService.findById(id);
        house.setId(houseOptional.get().getId());
        iHouseService.save(house);
        return new ResponseEntity<>(houseOptional, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<House> delete(@PathVariable Long id) {
        iHouseService.remote(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<House>> findById(@PathVariable Long id){
        return new ResponseEntity<>(iHouseService.findById(id),HttpStatus.OK);
    }
}

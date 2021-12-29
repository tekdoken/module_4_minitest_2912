package com.example.module_4_minitest_2912.service;

import java.util.Optional;

public interface IGeneralService<A> {
    Iterable<A> findAll();
    Optional<A> findById(Long id);
    void save(A a);
    void remote(Long id);
}

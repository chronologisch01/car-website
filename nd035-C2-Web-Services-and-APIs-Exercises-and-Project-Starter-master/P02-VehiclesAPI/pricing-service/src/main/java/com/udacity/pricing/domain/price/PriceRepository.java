package com.udacity.pricing.domain.price;

import com.udacity.pricing.domain.price.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PriceRepository implements CrudRepository<Price, Long> {

    @Override
    public <S extends Price> S save(S s) {
        return null;
    }

    @Override
    public <S extends Price> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Price> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Price> findAll() {
        return null;
    }

    @Override
    public Iterable<Price> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Price price) {

    }

    @Override
    public void deleteAll(Iterable<? extends Price> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}

package com.udacity.pricing.domain.price;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PriceRepository extends CrudRepository<Price, Long> {

    @Query("SELECT new com.udacity.pricing.domain.price.Price(p.id, p.currency, p.price, p.vehicleId) FROM Price p")
    Price getPriceByVehicleId(Long vehicleId);


}

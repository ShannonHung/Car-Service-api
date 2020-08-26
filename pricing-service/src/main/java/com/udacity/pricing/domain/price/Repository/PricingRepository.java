package com.udacity.pricing.domain.price.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;

public interface PricingRepository extends CrudRepository<Price,Long> {
    @Query("SELECT p FROM price p where p.vehicleId=:id")
    Price findVehicleById(Long id);

}

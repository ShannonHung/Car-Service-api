package com.udacity.pricing.Service;

import com.udacity.pricing.domain.price.Repository.Price;
import com.udacity.pricing.domain.price.Repository.PricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class PricingService {
    @Autowired
    PricingRepository pricingRepository;

    public List<Price> retrievePricings(){
        return (List<Price>) pricingRepository.findAll();
    }

    public Price retrieveVehicleById(Long id){
        return pricingRepository.findVehicleById(id);
    }
}

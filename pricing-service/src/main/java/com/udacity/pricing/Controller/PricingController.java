package com.udacity.pricing.Controller;

import com.udacity.pricing.Service.PricingService;
import com.udacity.pricing.domain.price.Repository.Price;
import com.udacity.pricing.domain.price.Repository.PricingRepository;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/services/price")
public class PricingController {
    private PricingService pricingService;

    @Autowired
    public void setPricingRepository(PricingService pricingService){
        this.pricingService=pricingService;
    }

    @GetMapping("/allprice")
    public ResponseEntity<List<Price>> getAllPrices(){
        List<Price> list = pricingService.retrievePricings();
        return new ResponseEntity<List<Price>>(list, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Price> getVehicleById(@RequestParam Long vehicleId) {
        System.out.println("vehicleId:" + vehicleId);
        Price price = pricingService.retrieveVehicleById(vehicleId);
        return new ResponseEntity<Price>(price, HttpStatus.OK);
    }
}

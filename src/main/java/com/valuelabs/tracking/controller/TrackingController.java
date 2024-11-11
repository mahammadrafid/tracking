package com.valuelabs.tracking.controller;

import com.valuelabs.tracking.dto.TrackingResponse;
import com.valuelabs.tracking.service.TrackingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * @author Rafi
 * Controller for Tracking details
 */
@RestController
public class TrackingController {
    private final TrackingService trackingService;

    public TrackingController(TrackingService trackingService) {
        this.trackingService = trackingService;
    }
    @GetMapping("/next-tracking-number")
    public TrackingResponse getNextTrackingNumber(
            @RequestParam String origin_country_id,
            @RequestParam String destination_country_id,
            @RequestParam double weight,
            @RequestParam OffsetDateTime created_at,
            @RequestParam UUID customer_id,
            @RequestParam String customer_name,
            @RequestParam String customer_slug) {

        return trackingService.generateTrackingNumber(origin_country_id, destination_country_id,
                weight, created_at, customer_id,
                customer_name, customer_slug);
    }
    @GetMapping("/test")
    public String getNextTrackingNumber(){
        return "i am working";
    }
}

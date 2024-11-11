package com.valuelabs.tracking.service;

import com.valuelabs.tracking.dto.TrackingResponse;
import com.valuelabs.tracking.model.TrackingNumber;
import com.valuelabs.tracking.repository.TrackingRepository;
import com.valuelabs.tracking.util.CommonUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;
import java.util.UUID;

@Service
public class TrackingService {
    private final TrackingRepository trackingRepository;


    public TrackingService(TrackingRepository trackingRepository) {
        this.trackingRepository = trackingRepository;

    }
    @Transactional
    public TrackingResponse generateTrackingNumber(String originCountryId, String destinationCountryId,
                                                   double weight, OffsetDateTime createdAt,
                                                   UUID customerId, String customerName,
                                                   String customerSlug){
    String trackingNumber;
    do{
        trackingNumber = CommonUtil.generateUniqueTrackingNumber();
    }while (trackingRepository.findByTrackingNumber(trackingNumber).isPresent());
        TrackingNumber trackingEntity = new TrackingNumber(
                trackingNumber,
                createdAt != null ? createdAt : OffsetDateTime.now(),
                originCountryId,
                destinationCountryId,
                weight,
                customerId,
                customerName,
                customerSlug
        );
        trackingRepository.save(trackingEntity);

        return new TrackingResponse(trackingNumber, trackingEntity.getCreatedAt());
    }
}

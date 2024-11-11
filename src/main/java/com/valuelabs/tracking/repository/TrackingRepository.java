package com.valuelabs.tracking.repository;
/**
 * @authur Rafi
 * This class for repo of TrackingNumber
 */

import com.valuelabs.tracking.model.TrackingNumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TrackingRepository extends JpaRepository<TrackingNumber, UUID> {

   Optional<TrackingNumber> findByTrackingNumber(String trackingNumber);

}

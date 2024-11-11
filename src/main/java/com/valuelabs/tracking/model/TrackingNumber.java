package com.valuelabs.tracking.model;

import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * @author Rafi
 * this class for model of TrackingNumber
 */
@Entity
public class TrackingNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    @Column(unique = true, nullable = false, length = 16)
    private String trackingNumber;
    private OffsetDateTime createdAt;
    @Column(nullable = false, length = 2)
    private String originCountryId;

    @Column(nullable = false, length = 2)
    private String destinationCountryId;

    @Column(nullable = false)
    private double weight;

    @Column(nullable = false)
    private UUID customerId;

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private String customerSlug;


    public TrackingNumber() {

    }

    public TrackingNumber(String trackingNumber, OffsetDateTime createdAt, String originCountryId,
                          String destinationCountryId, double weight, UUID customerId,
                          String customerName, String customerSlug) {
        this.trackingNumber = trackingNumber;
        this.createdAt = createdAt;
        this.originCountryId = originCountryId;
        this.destinationCountryId = destinationCountryId;
        this.weight = weight;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSlug = customerSlug;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

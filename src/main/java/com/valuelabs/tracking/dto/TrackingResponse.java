package com.valuelabs.tracking.dto;

import java.time.OffsetDateTime;

/**
 * @author Rafi
 * this class  to send response for Tracking
 * @param trackingNumber
 * @param createdAt
 */
public  record TrackingResponse (String trackingNumber, OffsetDateTime createdAt){};


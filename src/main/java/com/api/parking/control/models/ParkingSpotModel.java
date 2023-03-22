package com.api.parking.control.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpotModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parkingSpotNumber;

    private Boolean busy;

    private LocalDateTime dataStart;
}

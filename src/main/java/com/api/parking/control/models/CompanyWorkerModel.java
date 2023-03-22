package com.api.parking.control.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyWorkerModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nameComplete;

    private String cpf;

    private String telephoneNumber;

    private String address;

    private String emailAddress;

    private String companyPosition;

    private LocalDateTime dateStart;

    private LocalDateTime dateEnd;
}

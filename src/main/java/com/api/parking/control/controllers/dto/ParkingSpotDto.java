package com.api.parking.control.controllers.dto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class ParkingSpotDto {

    @NotBlank
    @Size(max = 20)
    private String name;

    @NotBlank
    @Size(max = 70)
    private String address;
}
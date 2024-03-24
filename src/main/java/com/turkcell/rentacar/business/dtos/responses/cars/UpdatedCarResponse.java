package com.turkcell.rentacar.business.dtos.responses.cars;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdatedCarResponse {
    private int id;

    private String name;

    private String brandName;

    private String fuelName;

    private String transmissionName;

    private LocalDateTime updatedDate;
}
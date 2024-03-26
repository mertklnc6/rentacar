package com.turkcell.rentacar.business.dtos.responses.cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllCarResponse {
    private int id;
    private int findexScore;
    private String name;
    private String brandName;
    private int dailyPrice;
    private int state;
    private String plate;
    private String fuelName;
    private String transmissionName;
}
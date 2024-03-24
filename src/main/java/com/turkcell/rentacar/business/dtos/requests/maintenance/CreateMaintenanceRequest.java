package com.turkcell.rentacar.business.dtos.requests.maintenance;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMaintenanceRequest {

    @NotNull
    private LocalDateTime dateSent;
    @Nullable
    private LocalDateTime dateReturned;

    private int carId;


}
package com.api.parkingcontrol.validation;

import com.api.parkingcontrol.dto.ParkingSpotDto;
import com.api.parkingcontrol.exeption.DataIntegrityViolationException;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ParkingSpotValidationImpl {

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotDto validationDataConflict(@NotNull ParkingSpotDto parkingSpotDto) {
        if (parkingSpotRepository.findByParkingSpotNumber(parkingSpotDto.getParkingSpotNumber()).size() == 1) {
            throw new DataIntegrityViolationException("Parking spot number already exists");
        } else if (parkingSpotRepository.findByLicensePlateCar(parkingSpotDto.getLicensePlateCar()).size() == 1) {
            throw new DataIntegrityViolationException("getLicensePlateCar already exists");
        } else if (parkingSpotRepository.findByApartmentAndBlock(parkingSpotDto.getApartment(), parkingSpotDto.getBlock()).isEmpty()) {
             return parkingSpotDto;
        } else {
            throw new DataIntegrityViolationException("Apartment and block already exists");
        }
    }
}
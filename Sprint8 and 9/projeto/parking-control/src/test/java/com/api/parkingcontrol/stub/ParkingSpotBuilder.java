package com.api.parkingcontrol.stub;

import com.api.parkingcontrol.dto.ParkingSpotDto;
import com.api.parkingcontrol.models.ParkingSpotModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpotBuilder {
    private UUID uuid;
    private String parkingSpotNumber;
    private String licensePlateCar;
    private String brandCar;
    private String modelCar;
    private String colorCar;
    private LocalDateTime registrationDate;
    private String responsibleName;
    private String apartment;
    private String block;

    public ParkingSpotBuilder withId(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public ParkingSpotBuilder withParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
        return this;
    }

    public ParkingSpotBuilder withLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
        return this;
    }


    public ParkingSpotBuilder withBrandCar(String brandCar) {
        this.brandCar = brandCar;
        return this;
    }


    public ParkingSpotBuilder withModelCar(String modelCar) {
        this.modelCar = modelCar;
        return this;
    }


    public ParkingSpotBuilder withColorCar(String colorCar) {
        this.colorCar = colorCar;
        return this;
    }


    public ParkingSpotBuilder withRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    public ParkingSpotBuilder withResponsibename(String responsibleName) {
        this.responsibleName = responsibleName;
        return this;
    }

    public ParkingSpotBuilder withApatment(String apartment) {
        this.apartment = apartment;
        return this;
    }


    public ParkingSpotBuilder withBlock(String block) {
        this.block = block;
        return this;
    }

    public ParkingSpotModel buildModel() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel(
                uuid,
                parkingSpotNumber,
                licensePlateCar,
                brandCar,
                modelCar,
                colorCar,
                registrationDate,
                responsibleName,
                apartment,
                block);
        return parkingSpotModel;
    }

    public ParkingSpotDto buildDto() {
        ParkingSpotDto parkinspotDto = new ParkingSpotDto(
                parkingSpotNumber,
                licensePlateCar,
                brandCar,
                modelCar,
                colorCar,
                responsibleName,
                apartment,
                block);
        return parkinspotDto;
    }


}

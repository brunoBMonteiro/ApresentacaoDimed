package com.api.parkingcontrol.repositories;


import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    List<ParkingSpotModel> findByParkingSpotNumber(String parkingSpotNumber);
    List<ParkingSpotModel> findByLicensePlateCar(String licensePlateCar);
    List<ParkingSpotModel> findByApartmentAndBlock(String apartment, String block);

}

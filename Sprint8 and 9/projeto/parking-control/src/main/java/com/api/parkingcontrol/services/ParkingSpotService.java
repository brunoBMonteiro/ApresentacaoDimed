package com.api.parkingcontrol.services;

import com.api.parkingcontrol.dto.ParkingSpotDto;
import com.api.parkingcontrol.exeption.ResourceNotFoundException;
import com.api.parkingcontrol.models.ParkingSpotModel;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public interface ParkingSpotService {
    /**
     * IF ok saved on bd
     *
     * @return Return ParkingSpotModel
     * @throws com.api.parkingcontrol.exeption.DataIntegrityViolationException if already have information on database
     */
    ParkingSpotModel save(ParkingSpotDto parkingSpotDto);

    /**
     * get bd parking spot model by id
     *
     * @return Return ParkingSpotModel
     * @throws ResourceNotFoundException if not found in database
     */
   ParkingSpotModel getParkingSpotById(UUID parkingID);

    /**
     * return all parking spot models
     *
     * @return Return ParkingSpotModel
     * @throws ResourceNotFoundException if not found in database
     */
    List<ParkingSpotModel> getAll();

    /**
     * return a boolean if deleted of db
     *
     * @return Return ParkingSpotModel
     * @throws ResourceNotFoundException if not found in database
     */
    Map<String, Boolean> deleteParkingSpot(UUID parkingID);

    /**
     * update a parkingspot model
     *
     * @return Return ParkingSpotModel
     * @throws ResourceNotFoundException if not found in database
     */
    ParkingSpotModel updateParkingSpot(UUID parkingID, @Valid ParkingSpotDto parkingSpotDetails);

}

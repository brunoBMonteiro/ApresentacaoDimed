package com.api.parkingcontrol.services;

import com.api.parkingcontrol.controllers.ParkingSpotController;
import com.api.parkingcontrol.dto.ParkingSpotDto;
import com.api.parkingcontrol.exeption.ResourceNotFoundException;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import com.api.parkingcontrol.validation.ParkingSpotValidationImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@AllArgsConstructor
@Service
public class ParkingSpotServiceImpl implements ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;
    final ParkingSpotValidationImpl parkingSpotValidation;

    @Transactional
    @Override
    public ParkingSpotModel save(ParkingSpotDto parkingSpotDto) {
        parkingSpotValidation.validationDataConflict(parkingSpotDto);
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        BeanUtils.copyProperties(parkingSpotDto, parkingSpotModel);
        parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return Optional.of(parkingSpotRepository.save(parkingSpotModel)).
                orElseThrow(() -> new ResourceNotFoundException("cannot save resouce not found"));
    }

    @Override
    public ParkingSpotModel getParkingSpotById(UUID parkingID) {
        var parkingSpotID = Optional.of(parkingSpotRepository.findById(parkingID).orElseThrow(() ->
                new ResourceNotFoundException("Not found id in database:: " + parkingID)));
        return parkingSpotID.get().add(linkTo(methodOn(ParkingSpotController.class).
                getAllParkingSpots()).withRel("List all ParkSpots"));
    }

    @Override
    public List<ParkingSpotModel> getAll() {
        List<ParkingSpotModel> getAllparking = parkingSpotRepository.findAll();
        for (ParkingSpotModel parkingSpotModel : getAllparking) {
            UUID parkingID = parkingSpotModel.getId();
            parkingSpotModel.add(linkTo(methodOn(ParkingSpotController.class).getParkingSpotById(parkingID)).withSelfRel());
        }
        return Optional.of((getAllparking)).orElseThrow(() ->
                new ResourceNotFoundException("Not found in database"));
    }

    @Transactional
    @Override
    public Map<String, Boolean> deleteParkingSpot(UUID parkingID) {
        var parkingSpotID = parkingSpotRepository.findById(parkingID);
        parkingSpotRepository.delete(parkingSpotID.orElseThrow(() ->
                new ResourceNotFoundException("Not found in database:: " + parkingID)));
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @Transactional
    @Override
    public ParkingSpotModel updateParkingSpot(UUID parkingID, @Valid ParkingSpotDto parkingSpotDetails) {
        parkingSpotValidation.validationDataConflict(parkingSpotDetails);
        ParkingSpotModel parkingSpotModelOptional = parkingSpotRepository.findById(parkingID).
                orElseThrow(() -> new ResourceNotFoundException("Not found in database:: " + parkingID));
        var parkingSpotModel = new ParkingSpotModel();
        BeanUtils.copyProperties(parkingSpotDetails, parkingSpotModel);
        parkingSpotModel.setId(parkingSpotModelOptional.getId());
        parkingSpotModel.setRegistrationDate(parkingSpotModelOptional.getRegistrationDate());
        return parkingSpotRepository.save(parkingSpotModel);
    }
}



package com.api.parkingcontrol.validation;

import com.api.parkingcontrol.exeption.DataIntegrityViolationException;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import com.api.parkingcontrol.stub.ParkingSpotBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.UUID;

@ExtendWith(SpringExtension.class)
class ParkingSpotValidationImplTest {
    @InjectMocks
    private ParkingSpotValidationImpl parkingSpotValidation;

    @Mock
    private ParkingSpotRepository parkingSpotRepository;

    @Test
    @DisplayName("Teste de validação de estacionamento")
    void validationDataConflict() {
        var expected = new ParkingSpotBuilder()
                .withId(UUID.randomUUID())
                .buildDto();

        Mockito.when(parkingSpotRepository.findByParkingSpotNumber(expected.getParkingSpotNumber()))
                .thenThrow(new DataIntegrityViolationException("Parking spot number already exists"));

        Assertions.assertThrows(DataIntegrityViolationException.class,
                () -> parkingSpotValidation.validationDataConflict(expected));

    }


    @Test
    @DisplayName("Teste de validação de estacionamento")
    void validationDataConflict2() {
        var expected = new ParkingSpotBuilder()
                .withId(UUID.randomUUID())
                .buildDto();

        Mockito.when(parkingSpotRepository.findByLicensePlateCar(expected.getParkingSpotNumber()))
                .thenThrow(new DataIntegrityViolationException("getLicensePlateCar already exists"));

        Assertions.assertThrows(DataIntegrityViolationException.class,
                () -> parkingSpotValidation.validationDataConflict(expected));

    }

    @Test
    @DisplayName("Teste de validação de estacionamento")
    void validationDataConflict4() {
        var expected = new ParkingSpotBuilder()
                .withId(UUID.randomUUID())
                .buildDto();

        Mockito.when(parkingSpotRepository.findByApartmentAndBlock(expected.getApartment(), expected.getBlock()))
                .thenThrow(new DataIntegrityViolationException("Apartment and block already exists"));

        Assertions.assertThrows(DataIntegrityViolationException.class,
                () -> parkingSpotValidation.validationDataConflict(expected));

    }


}
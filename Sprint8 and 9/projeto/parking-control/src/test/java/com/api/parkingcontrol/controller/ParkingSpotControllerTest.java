package com.api.parkingcontrol.controller;

import com.api.parkingcontrol.controllers.ParkingSpotController;
import com.api.parkingcontrol.dto.ParkingSpotDto;
import com.api.parkingcontrol.services.ParkingSpotService;
import com.api.parkingcontrol.stub.ParkingSpotBuilder;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


//JUnit 5 permite que vários testes trabalhem simultaneamente
//JUnit 4 vai apenas ate o java 7


@RunWith(MockitoJUnitRunner.class)
public class ParkingSpotControllerTest {

    @Mock
    private ParkingSpotService parkingSpotService;

    @InjectMocks
    private ParkingSpotController parkingSpotController;

    @Test
    @DisplayName("Validate get all Success")
    public void returnAllParkingIfSuccesull() {

        final var expectGet = List.of(new ParkingSpotBuilder().
                withId(UUID.randomUUID())
                .withParkingSpotNumber("AAA")
                .withLicensePlateCar("aaa")
                .withBrandCar("bmw")
                .withModelCar("aa")
                .withColorCar("Black")
                .withRegistrationDate(LocalDateTime.now())
                .withResponsibename("Rafaela")
                .withApatment("123")
                .withBlock("2")
                .buildModel());

        Mockito.when(parkingSpotService.getAll()).thenReturn(expectGet);

        final var response = parkingSpotController.getAllParkingSpots();
        Assertions.assertThat(expectGet).isEqualTo(response);
    }

    @Test
    @DisplayName("Validate get  Success")
    public void returnIfParkingSpotByIdExistis() {
        final var expectGet = new ParkingSpotBuilder().
                withId(UUID.randomUUID())
                .withParkingSpotNumber("23")
                .withLicensePlateCar("INX9870A")
                .buildModel();

        Mockito.when(parkingSpotService.getParkingSpotById(expectGet.getId())).thenReturn(expectGet);
        final var response = parkingSpotController.getParkingSpotById(expectGet.getId());
        Assertions.assertThat(expectGet).isEqualTo(response);
    }


    // add all fileds
    @Test
    @DisplayName("validate to save")
    public void returnSavedParkingSpotIfSucess() {

        final var expectGet = new ParkingSpotBuilder()
                .withParkingSpotNumber("23")
                .withLicensePlateCar("INX9870A")
                .buildModel();

        Mockito.when(parkingSpotService.save(ArgumentMatchers.any(ParkingSpotDto.class)))
                .thenReturn(expectGet);
        final var response = new ParkingSpotBuilder().withParkingSpotNumber(expectGet.getParkingSpotNumber()).buildDto();

        final var cliente = parkingSpotController.saveParkingSpot(response);

        Assertions.assertThat(cliente).isNotNull().isEqualTo(expectGet);
    }

    @Test
    @DisplayName("validate to update")
    public void returnIfUpdatedParkingSpotSuccess() {

        final var expectGet = new ParkingSpotBuilder()
                .withId(UUID.randomUUID())
                .withParkingSpotNumber("AAA")
                .withLicensePlateCar("aaa")
                .buildModel();

        final var expectedDto = new ParkingSpotBuilder()
                .withParkingSpotNumber("BBB")
                .withLicensePlateCar("bbb")
                .buildDto();


        Mockito.when(parkingSpotService.updateParkingSpot(ArgumentMatchers.any(expectGet.getId().getClass()), ArgumentMatchers.any(expectedDto.getClass())))
                .thenReturn(expectGet);

        final var response = new ParkingSpotBuilder().withParkingSpotNumber(expectGet.getParkingSpotNumber()).buildDto();

        final var cliente = parkingSpotController.updateParkingspot(expectGet.getId(), response);

        Assertions.assertThat(cliente).isNotNull().isEqualTo(expectGet);
    }


    @Test
    @DisplayName("validate to delete")
    public void returnIfDeletedParkingSpotSuccess() {
        final var expectGet = new ParkingSpotBuilder()
                .withId(UUID.randomUUID())
                .withParkingSpotNumber("AAA")
                .withLicensePlateCar("aaa")
                .buildModel();

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.FALSE);

        Mockito.when(parkingSpotService.deleteParkingSpot(expectGet.getId())).thenReturn(response);
        final var cliente = parkingSpotController.deleteParkingSpot(expectGet.getId());
        Assertions.assertThat(cliente).isNotNull().isEqualTo(response);
    }

}

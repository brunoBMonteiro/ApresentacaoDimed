package com.api.parkingcontrol.contract;

import com.api.parkingcontrol.controllers.ParkingSpotController;
import com.api.parkingcontrol.services.ParkingSpotService;
import com.api.parkingcontrol.stub.ParkingSpotBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
// https://miro.medium.com/max/1290/1*Yzzk9bNkuXumtXPNVoDorQ.png
@RunWith(SpringRunner.class)
@WebMvcTest(ParkingSpotController.class)
public class ParkingSpotControllerContractTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ParkingSpotService service;

    // como trazer o apenas o contexto que eu ultilizo (contrato)

    @Test
    public void returnGetAllIfSuccess() throws Exception {

        var teste = new ParkingSpotBuilder()
                .withParkingSpotNumber("jose").buildModel();

        given(service.getAll()).willReturn(List.of(teste));

        mvc.perform(get("/parking-spot")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].parkingSpotNumber")
                        .value("jose"));
    }
}

package com.api.parkingcontrol.contract;

import com.api.parkingcontrol.services.ParkingSpotService;
import com.api.parkingcontrol.stub.ParkingSpotBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class WebClientMockWebServerIntegrationTest {

    @Autowired
    private ParkingSpotService parkingSpotService;

    @Mock
    private RestTemplate restTemplate;

    private MockRestServiceServer mockServer;
    private ObjectMapper mapper = new ObjectMapper();


    @BeforeEach
    public void init() {
        mockServer = MockRestServiceServer.createServer(restTemplate);
    }


    @Test
    public void givenMockingIsDoneByMockRestServiceServer_whenGetIsCalled_thenReturnsMockedObject() throws URISyntaxException, JsonProcessingException {
        var idSet = "6554083b-0a4e-4768-8f32-47d30bdc3162";
        UUID uuid = UUID.fromString(idSet);


        String time = "2022-04-22T17:02:28.176640";
        var testTime = LocalDateTime.parse(time);


        var expected = new ParkingSpotBuilder()
                .withId(uuid)
                .withParkingSpotNumber("12332")
                .withLicensePlateCar("13443")
                .withBrandCar("BMW")
                .withModelCar("ix")
                .withColorCar("Black")
                .withRegistrationDate(testTime)
                .withResponsibename("Rafaela")
                .withApatment("123")
                .withBlock("2").buildModel();


        mockServer.expect(ExpectedCount.once(),
                        requestTo(new URI("http://localhost:8080/parking-spot/parkingspot-id/6554083b-0a4e-4768-8f32-47d30bdc3162")))
                        .andExpect(method(HttpMethod.GET))
                        .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(mapper.writeValueAsString(expected))
                );


        var ss = parkingSpotService.getParkingSpotById(expected.getId());


        Assertions.assertThat(expected).isEqualTo(ss);


    }

}

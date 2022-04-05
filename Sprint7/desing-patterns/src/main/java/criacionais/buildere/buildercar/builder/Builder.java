package criacionais.buildere.buildercar.builder;


import criacionais.buildere.buildercar.cars.CarType;
import criacionais.buildere.buildercar.components.Engine;
import criacionais.buildere.buildercar.components.GPSNavigator;
import criacionais.buildere.buildercar.components.Transmission;
import criacionais.buildere.buildercar.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
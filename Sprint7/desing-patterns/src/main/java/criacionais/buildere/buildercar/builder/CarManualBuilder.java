package criacionais.buildere.buildercar.builder;

import criacionais.buildere.buildercar.cars.CarType;
import criacionais.buildere.buildercar.cars.Manual;
import criacionais.buildere.buildercar.components.Engine;
import criacionais.buildere.buildercar.components.GPSNavigator;
import criacionais.buildere.buildercar.components.Transmission;
import criacionais.buildere.buildercar.components.TripComputer;

/**
 Ao contrário de outros padrões de criação, o Builder pode construir produtos não relacionados,
 * que não possuem a interface comum.
 * <p>
 * Neste caso, construímos um manual do usuário para um carro, usando as mesmas etapas que
 * construiu um carro. Isso permite produzir manuais para modelos de carros específicos,
 * configurado com diferentes recursos.
 */
public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
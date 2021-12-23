package features.iDezesseis.recordclass;

//A Record type definition is final, meaning you cannot
// create subclasses (subrecords) of a Java Record type.

public record Vehicle (String brand, String licensePlate)  {

    // Multi Constructors
    public Vehicle(String brand) {
        this(brand, null);
    }



    public static String brandAsUpperCase(Vehicle vehicle) {
        return vehicle.brand.toUpperCase();
    }


}


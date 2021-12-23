package features.iDezesseis.recordclass;


import static features.iDezesseis.recordclass.Vehicle.brandAsUpperCase;

public class ReleaseRecordClass {


        public static void main(String[] args) {

            Vehicle vehicle = new Vehicle("Mercedes", "UX 1238 A95");

            System.out.println( vehicle.brand() );
            System.out.println( vehicle.licensePlate() );
            System.out.println( vehicle.toString() );

            System.out.println("--------------- Another constructor ");

            Vehicle vehicle2 = new Vehicle("Mercedes");
            System.out.println( vehicle2.brand() );
            System.out.println( vehicle2.licensePlate() );
            System.out.println( vehicle2.toString() );

            // call static method
            System.out.println("Static method -----------");
            System.out.println(brandAsUpperCase(vehicle));


Truck truck = new Truck();
            System.out.println(truck);


        }

}

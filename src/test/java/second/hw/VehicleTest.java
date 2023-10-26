package second.hw;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Toyota","sq9",2009);
        Assertions.assertTrue(true);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Toyota","sq9",2009);
        Assertions.assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("KTM","290 SUPER DUKE GT",2015);
        Assertions.assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedDuringTestDrive() {
        Car car = new Car("Toyota","sq9",2009);
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedDuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("KTM","290 SUPER DUKE GT",2015);
        motorcycle.testDrive();
        Assertions.assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarStopsWhenParked() {
        Car car = new Car("Toyota","sq9",2009);
        car.testDrive();
        car.park();
        Assertions.assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleStopsWhenParked() {
        Motorcycle motorcycle = new Motorcycle("KTM","290 SUPER DUKE GT",2015);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(0, motorcycle.getSpeed());
    }
}
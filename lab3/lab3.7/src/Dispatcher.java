import java.util.ArrayList;
class Dispatcher {
    private ArrayList<Driver> drivers;
    private ArrayList<Car> cars;

    public Dispatcher(ArrayList<Driver> drivers, ArrayList<Car> cars) {
        this.drivers = drivers;
        this.cars = cars;
    }

    public void assignCarAndDriverForTrip(Trip trip) {
        Car car = getAvailableCar();
        Driver driver = getAvailableDriver();
        if (car != null && driver != null) {
            trip.setCar(car);
            trip.setDriver(driver);
            car.setAssigned(true);
            driver.setAssigned(true);
        }
    }

    private Car getAvailableCar() {
        for (Car car : cars) {
            if (!car.isAssigned()) {
                return car;
            }
        }
        return null;
    }

    private Driver getAvailableDriver() {
        for (Driver driver : drivers) {
            if (!driver.isAssigned()) {
                return driver;
            }
        }
        return null;
    }

    public void dismissDriver(Driver driver) {
        driver.setAssigned(false);
    }
}

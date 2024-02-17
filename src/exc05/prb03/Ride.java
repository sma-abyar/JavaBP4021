package exc05.prb03;

import java.util.Objects;

public class Ride {
    Driver driver;
    Passenger passenger;
    String origin;
    String destination;
    int price;
    String status;

    public Ride(Driver driver, Passenger passenger, String origin, String destination, Integer price) {
        this.driver = driver;
        this.passenger = passenger;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.status = "CREATED";
    }

    public void start() {
        if (Objects.equals(status, "CREATED")) {
            status = "IN_PROGRESS";
            driver.status = "IN_RIDE";
            passenger.status = "IN_RIDE";
        } else {
            status = "INVALID";
            driver.status = "AVAILABLE";
            passenger.status = "AVAILABLE";
        }
    }

    public void finish() {
        if (Objects.equals(status, "IN_PROGRESS")) {
            status = "FINISHED";
            driver.status = "AVAILABLE";
            passenger.status = "AVAILABLE";
        } else {
            status = "INVALID";
            driver.status = "AVAILABLE";
            passenger.status = "AVAILABLE";
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getPrice() {
        return price;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return origin;
    }
}

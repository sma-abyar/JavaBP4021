package exc05.prb03;

public class Driver {
    String firstName;
    String lastName;
    String phoneNumber;
    String status;
    Car car;

    public Driver(String firstName, String lastName, String phoneNumber, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.car = car;
        this.status = "AVAILABLE";
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getStatus() {
        return status;
    }

    public Car getCar() {
        return car;
    }
}

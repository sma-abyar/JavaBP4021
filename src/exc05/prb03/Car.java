package exc05.prb03;

public class Car {
    String type;
    String color;
    String plateNumber;
    boolean isVIP;

    public Car(String type, String color, String plateNumber, boolean isVIP) {
        this.type = type;
        this.color = color;
        this.plateNumber = plateNumber;
        this.isVIP = isVIP;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setVIP(boolean VIP) {
        this.isVIP = VIP;
    }
    public String getColor() {
        return color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getType() {
        return type;
    }

    public boolean isVIP() {
        return isVIP;
    }
}

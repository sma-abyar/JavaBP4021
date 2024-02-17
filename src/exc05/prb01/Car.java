package exc05.prb01;

public class Car {
    int position;
    double level;

    public Car(int level) {
        setLevel(level);
        setPosition(0);
    }

    public void moveBackward(int x) {
        this.position -= (int) (x * level);
    }

    public void moveForward(int x) {
        position += (int) (x * level);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getLevel() {
        return level;
    }
}

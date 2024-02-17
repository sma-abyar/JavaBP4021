package exc06.prb03;

public class Player {
    private final String name;
    private int position = 1;

    public Player(String name) {
        this.name = name;
    }

    public int dice() {
        return (int) (Math.ceil(Math.random() * 6));
    }

    public void move(int x, int lastCell) {
        if (getPosition()+x<=lastCell){
            setPosition(getPosition()+x);
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }
}

package exc06.prb03;

import java.util.LinkedList;
import java.util.List;

public class GameManager {
    private final List<Player> players = new LinkedList<>();
    private final int[] goToCell;
    private final int finalCell;
    private int currentTurn;
    private boolean isFinished;
    public String winner;

    public GameManager(int[] goToCell, int finalCell) {
        this.goToCell = goToCell;
        this.finalCell = finalCell;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void initiateNextTurn() {
        if (!isFinished()){
            Player player = getPlayers().get(getCurrentTurn()% getPlayers().size());
            player.move(player.dice(),getFinalCell());
            player.setPosition(goToCell[player.getPosition()]);
            if (player.getPosition()==getFinalCell()){
                this.winner = player.getName();
                setFinished(true);
            }
            /*for (Player player : players) {
                player.move(player.dice(),getFinalCell());
                player.setPosition(goToCell[player.getPosition()]);
                if (player.getPosition()==getFinalCell()){
                    setFinished(true);
                }
            }*/
            setCurrentTurn(getCurrentTurn()+1);
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int[] getGoToCell() {
        return goToCell;
    }

    public int getFinalCell() {
        return finalCell;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
// TODO ADD GETTERS AND SETTERS
}

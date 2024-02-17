package exc06.prb03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] goToCell = {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 21, 10, 11, 22, 13, 14, 3, 16, 17, 18, 19, 20,
                21, 22, 23, 42, 25, 26, 27, 28, 29, 30, 31, 32, 33, 17, 35, 36, 37, 38, 39,
                40, 41, 42, 43, 57, 45, 46, 47, 48, 49, 60, 51, 37, 53, 54, 55, 56, 57, 58,
                59, 60, 61, 62, 63, 64, 65, 66, 47, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
                78, 79, 19, 81, 82, 83, 84, 95, 86, 87, 88, 89, 90, 73, 92, 93, 94, 95, 80,
                49, 98, 99, 100
        };
        GameManager gameManager = new GameManager(goToCell, 100);
        System.out.println("Enter name of player 1:");
        Player player1 = new Player(sc.next());
        System.out.println("PLayer 1 Set to "+ player1.getName());
        System.out.println("Enter name of player 2:");
        Player player2 = new Player(sc.next());
        System.out.println("PLayer 2 Set to "+ player2.getName());
        gameManager.addPlayer(player1);
        gameManager.addPlayer(player2);
        player1.setPosition(30);
        player2.setPosition(30);
        System.out.println("Start!");
        System.out.println("Enter the name of your player to dice for it");
        while (!gameManager.isFinished()){
            String dice = sc.next();
            if(dice.equals("m")){
                gameManager.initiateNextTurn();
                gameManager.initiateNextTurn();
                System.out.println("Mahdi:" + player1.getPosition()+ ", Abyar:" + player2.getPosition()+";");
            }
        }
        System.out.println("Game Finished; "+gameManager.winner+" won!!!");
    }
}

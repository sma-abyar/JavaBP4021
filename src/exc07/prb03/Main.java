package exc07.prb03;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // set up
        List<Map<String, Integer>> map = List.of(
                Map.of("x", 5, "y", 1, "size", 3),
                Map.of("x", 8, "y", 1, "size", 5),
                Map.of("x", 1, "y", 3, "size", 2),
                Map.of("x", 8, "y", 4, "size", 2),
                Map.of("x", 4, "y", 5, "size", 4),
                Map.of("x", 7, "y", 6, "size", 2),
                Map.of("x", 8, "y", 7, "size", 1),
                Map.of("x", 1, "y", 8, "size", 3),
                Map.of("x", 3, "y", 8, "size", 1)
        );



        Blobservation blobservation = new Blobservation(8, 8);
        blobservation.populate(map);
        Blob[][] table = blobservation.getTable();

        // act
        blobservation.move();
        printTable(table);

        // act
        blobservation.move();
        printTable(table);

        // act
        blobservation.move();
        printTable(table);

        // act
        blobservation.move();
        printTable(table);

        // act
        blobservation.move();
        printTable(table);

        // act
        blobservation.move();
        printTable(table);

        // act
        blobservation.move();
        printTable(table);
    }



    private static void printTable(Blob[][] table) {
        for (int i = 1; i < table[0].length; i++) {
            for (int j = 1; j < table.length; j++) {
                if (table[j][i] == null)
                    System.out.print("0 ");
                else
                    System.out.print(table[j][i].getSize() + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
    }


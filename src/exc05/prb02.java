package exc05;

import java.util.Scanner;

public class prb02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Long[][] tb = new Long[n][m];
        boolean hasGholle = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tb[i][j] = sc.nextLong();
            }
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (tb[i][j] > tb[i - 1][j - 1] && tb[i][j] > tb[i - 1][j] && tb[i][j] > tb[i - 1][j + 1] && tb[i][j] > tb[i][j - 1] && tb[i][j] > tb[i][j + 1] && tb[i][j] > tb[i + 1][j - 1] && tb[i][j] > tb[i + 1][j] && tb[i][j] > tb[i + 1][j + 1]) {
                    System.out.print((i + 1) + " ");
                    System.out.println(j + 1);
                    hasGholle = true;
                }
            }
        }
        if (!hasGholle) {
            System.out.println("No Gholle Found");
        }
    }
}

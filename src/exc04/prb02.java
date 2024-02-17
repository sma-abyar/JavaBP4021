package exc04;

import java.util.Scanner;

public class prb02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(), j = sc.nextInt();
        int[][] a = new int[i][j];
        int[] b = new int[j];
        int[] c = new int[i];
        for (int x =0; x<i; x++){
            for (int y=0; y<j; y++){
                a[x][y] = sc.nextInt();
            }
        }
        for (int x =0; x<j; x++){
            b[x] = sc.nextInt();
        }
        for (int x=0; x<i; x++){
            int sum = 0;
            for (int y = 0; y<j; y++){
                sum += a[x][y] * b[y];
            }
            c[x] = sum;
        }
        for (int x = 0; x<i; x++){
            System.out.print(c[x] + " ");
        }
    }
}

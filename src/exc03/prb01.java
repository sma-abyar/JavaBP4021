package exc03;

import java.util.Scanner;

public class prb01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int col = 1;
        boolean next = true;
        boolean nextCol = true;
        int nline = n;
        for (int i=0; i < n*n; i++) {
            int[] row = new int[n];
            int a = i%n;
            row[a] = sc.nextInt();
            if (nline < n-1){
                nline += 1;
                continue;
            }else if(nline==n-1){
                nline = n;
                next = true;
            }
            if(row[a]==3){
                next = false;
                nextCol = false;
            }else if (row[a]==1){
                if (nextCol && next && col<n){
                    total +=1;
                    col ++;
                }else if (nextCol && col == n){
                    total +=1;
                    col ++;
                    nextCol = false;
                }
            }else if (row[a] == 2){
                if (next && nextCol){
                    total +=1;
                }
                next = false;
                nline = 0;
            }
        }
        System.out.println(total);
    }
}
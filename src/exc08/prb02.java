package exc08;

import java.util.Scanner;

public class prb02 {
    public static int nextStep(String[][] park, int[] starter, int n){
        int dPath =0;
        int lPath =0;
        int uPath =0;
        int rPath =0;
        //down
        if ((starter[0] >= 0) && (starter[0] < n-1) && park[starter[0] + 1][starter[1]].equals("#")){
            park[starter[0] + 1][starter[1]] = "$";
            starter[0] ++;
            dPath = nextStep(park, starter, n)+1;
        }//up
        if ((starter[0] > 0) && (starter[0] < n) && park[starter[0] - 1][starter[1]].equals("#")){
            park[starter[0] - 1][starter[1]] = "$";
            starter[0] --;
            uPath = nextStep(park, starter, n)+1;
        }//right
        if ((starter[1] >= 0) && (starter[1] < n-1) && park[starter[0]][starter[1]+1].equals("#")){
            park[starter[0]][starter[1]+1] = "$";
            starter[1] ++;
            rPath = nextStep(park, starter, n)+1;
        }//left
        if ((starter[1] > 0) && (starter[1] < n) && park[starter[0]][starter[1]-1].equals("#")){
            park[starter[0]][starter[1]-1] = "$";
            starter[1] --;
            lPath = nextStep(park, starter, n)+1;
        }
        return Math.max(uPath,Math.max(dPath,Math.max(lPath,rPath)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] starter = new int[2];
        String[][] park = new String[n][n];
        for (int i =0; i<n;i++){
            for (int j=0; j<n; j++){
                park[i][j] = sc.next();
                if(park[i][j].equals("s")){
                    starter[0] = i;
                    starter[1] = j;
                }
            }
        }
        System.out.println(nextStep(park,starter, n));

    }
}

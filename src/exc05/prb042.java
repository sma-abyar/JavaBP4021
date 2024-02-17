package exc05;
import java.util.Scanner;

public class prb042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[][] d = new int[q][3];
        int min = 0, max =0;
        for (int i =0; i<q; i++){
            d[i][0] = sc.nextInt();
            d[i][1] = sc.nextInt();
            d[i][2] = 0;
            if (i==0){
                min = d[i][0];
                max = d[i][1];
            }else {
                if (d[i][0] < d[i-1][0]){
                    min = d[i][0];
                }if (d[i][1] > d[i-1][1]){
                    max = d[i][1];
                }
            }
        }/*
        for (int i = 0; i<q; i++){
            for(int k = d[i][0] ; k<= d[i][1]; k++) {
                if (k==0 || k==1){
                    break;
                }else {
                    int counter =0;
                    for (int j = 1; j <= d[i][1]; j++) {
                        if(k%j==0){
                            counter++;
                        }
                    }if (counter==2){
                        d[i][2]++;
                    }
                }
            }
            System.out.println(d[i][2]);
        }*/
        for (int i = min; i<= max; i++){
            if (i==0 || i==1){
                continue;
            }else {
                int counter =0;
                for (int j = 1; j <= max; j++) {
                    if(i%j==0){
                        counter++;
                    }
                }
                if (counter==2){
                    for (int k = 0; k<q;k++){
                        if (i<=d[k][1] && i >= d[k][0]){
                            d[k][2]++;
                        }
                    }
                }
            }
        }
        for (int i =0; i<q;i++){
            System.out.println(d[i][2]);
        }
    }
}

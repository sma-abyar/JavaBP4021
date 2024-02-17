package exc04;

import java.util.Scanner;

public class prb06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), inp = n;
        n = (int) Math.pow(2,Math.floor(n/2)+2) -1;
        char tag ='#';
        char dot ='.';
        int round = 0;
        double sq = n;
        char sp = ' ';
        int cntr = n /2, height = cntr - 1;
        char[][] crpt = new char[n][n];
        for (int x = 0; x <inp;x++){
            if (x%2==0){
                int width = (int) (n - Math.floor(sq))/2;
                for (int i = width; i<n-width; i++){
                    if (i==width || i==n-width-1){
                        for (int j=width; j< n-width-1;j++){
                            crpt[i][j] = tag;
                        }
                        crpt[i][n-width-1]=tag;
                    }else {
                        crpt[i][width] = tag;
                        for (int j=width+1; j<n-width-1 ;j++){
                            crpt[i][j] = dot;
                        }
                        crpt[i][n-width-1] = tag;
                    }
                }
                sq /= 2;
            }if(x%2==1){
                int j =0;
                for(int i = height; i>= 0; i--){
                    crpt[cntr+j][cntr-i] = tag;
                    crpt[cntr+j][cntr+i] = tag;
                    crpt[cntr-j][cntr-i] = tag;
                    crpt[cntr-j][cntr+i] = tag;
                    j++;
                }
                height = height/2 -1;
            }
        }

        for (int i =0; i<n;i++){
            for (int j=0; j<n-1; j++){
                System.out.print(crpt[i][j]);
            }
            System.out.println(crpt[i][n-1]);
        }

    }
}

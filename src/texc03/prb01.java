package texc03;

import java.util.Scanner;

public class prb01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char star = '*';
        int k = n- 2;
        for (int i=0; i<n; i++){
            int lSpace = Math.abs(n/2-i);
            int bSpace = k - Math.abs(k-2*i+1);
            if (i==0 || i == n-1){
                for (int j=0 ; j<lSpace; j++){
                    System.out.print(' ');
                }
                System.out.println(star);
            }else {
                for (int j=0 ; j<lSpace; j++){
                    System.out.print(' ');
                }
                System.out.print(star);
                for (int j= 0; j<bSpace;j++){
                    System.out.print(' ');
                }
                System.out.println(star);
            }
        }
    }
}

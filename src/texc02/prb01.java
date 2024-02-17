package texc02;

import java.util.Scanner;

public class prb01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,q,i;
        a = sc.nextInt();
        b = sc.nextInt();
        q = sc.nextInt();
        i = 0;
        while (i<q){
            int x = sc.nextInt();
            int finalResault = (int) (Math.pow(Math.pow(x-a,2),0.5)+Math.pow(Math.pow(x-b,2),0.5));
            System.out.println(finalResault);
            i++;
        }
    }
}

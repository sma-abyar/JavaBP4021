package exc02;

import java.util.Scanner;

public class prb03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result,n, x0, i = 0;
        n = sc.nextInt();
        x0 = sc.nextInt();
        result = 0;
        while (i<=n){
            int a = sc.nextInt();
            result += (int) (a*(Math.pow(x0,i)));
            i++;
        }
        System.out.println(result);
    }
}

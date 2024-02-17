package texc02;

import java.util.Scanner;

public class prb04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,min;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        min = Math.min(a,b);
        double surplus = 1.0*(a+b)/2 - min;
        int step = (int) (Math.ceil(surplus/c));
        System.out.println(step);
    }
}

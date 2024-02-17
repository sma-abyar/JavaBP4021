package exc02;

import java.util.Scanner;

public class prb02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, minNum, maxNum;
        x = sc.nextInt();
        minNum = x;
        maxNum = x;
        while (sc.hasNextInt()){
            int y = sc.nextInt();
            minNum = Math.min(y,minNum);
            maxNum = Math.max(y,maxNum);
//            System.out.println(x);
        }
        System.out.println(minNum);
        System.out.println(maxNum);
    }
}

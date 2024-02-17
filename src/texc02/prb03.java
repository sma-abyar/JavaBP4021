package texc02;

import java.util.Scanner;

public class prb03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reshte = sc.nextLine();
        int i = 0;
        while (i<reshte.length()/2){
            char fchar = reshte.charAt(i);
            char echar = reshte.charAt(reshte.length()-i-1);
            if (fchar==echar){
                i ++;
                if (i == reshte.length()/2){
                    System.out.println("YES");
                }
            }else {
                System.out.println("NO");
                break;
            }
        }
    }
}

package exc02;

import java.util.Scanner;

public class prb04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reshte = sc.next();
        int loreshte, i;
        long mult = 1;
        loreshte = reshte.length();
        i = 0;
        while (i<loreshte){
            char cchar = reshte.charAt(i);
            if (cchar == '0' && i == 0){
                mult *= 0;
            }else if (cchar =='?' && i==0){
                mult *= 9;
            }else if (cchar == '?') {
                mult *= 10;
            }else {
                mult *= 1;
            }
            i ++;
        }
        System.out.println(mult);
    }
}

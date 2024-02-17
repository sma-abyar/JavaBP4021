package exc03;

import java.util.Scanner;

public class prb032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String revers = "";
        for (int i =0; i<number.length();i++){
            revers += number.charAt(number.length()-i-1);
        }

        String finalNum = "";
        for (int i =0; i<revers.length();i++){
            finalNum += revers.charAt(revers.length()-i-1);
        }
        System.out.println(finalNum);
    }
}

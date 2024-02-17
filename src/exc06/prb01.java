package exc06;

import java.util.Scanner;

public class prb01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int nums = 300;
        for (int i = 1; i<=nums; i++){
            String check = convertToBase(i*i, base);
            boolean p = isPalindrome(check);
            if(p){
                System.out.println(i +" "+check);
            }
        }
    }
    public static String convertToBase(int n, int base) {
        String newNum = "";
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*";
        while (n>0){
            if (n >= base){
                int charn = n % base;
                n /= base;
                newNum = chars.charAt(charn) + newNum;
            }else{
                newNum = chars.charAt(n) + newNum;
                break;
            }
        }
        return newNum;
    }
    public static boolean isPalindrome(String s) {
        boolean isP = true;
        for (int j=0; j<s.length()/2; j++){
            char a = s.charAt(j);
            char b = s.charAt(s.length()-j-1);
            if(a != b){
                isP = false;
                break;
            }
        }
        return isP;
    }
}

package exc03;

import java.util.Scanner;

public class prb011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int col = 0;
        int total = 0;
        boolean next = true;
        for (int i=0; i<n; i++) {
            String row = sc.nextLine();
            for (int f=0; f<n+2; f+=2){
                if(row.charAt(f)=='1'){
                    next = false;
                }else if (row.charAt(f)=='2'){
                    if (next){
                        total +=1;
                    }
                }else if (row.charAt(f) == '3') {
                    total += 1;
                    break;
                }
            }

        }
        System.out.println(total);

    }
}

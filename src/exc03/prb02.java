package exc03;

import java.util.Scanner;

public class prb02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width, height, n = sc.nextInt();
        width = 2*n;
        height = 2*n -1;
        char space = ' ', star = '*';
        for(int i=0; i<width;i++){
            if (i==0){
                System.out.print(space);
            }else if(i==width-1){
                System.out.println(space);
            }else{
                System.out.print(star);
            }
        }
        for (int i=1; Math.abs(n-i)<n;i++){
            int newStar = Math.abs(n-i);
            int newSpace = n - newStar;
            if (newStar == 0){
                i++;
                continue;
            }
            for (int j=0; j<newStar;j++){
                System.out.print(star);
            }
            for (int j=0; j<newSpace;j++){
                System.out.print(space);
            }
            for (int j=0; j<newSpace;j++){
                System.out.print(space);
            }
            for (int j=0; j<newStar-1;j++){
                System.out.print(star);
            }
            System.out.println(star);
            /*if (i == n-1){
                i++;
            }*/
        }
        for(int i=0; i<width;i++){
            if (i==0){
                System.out.print(space);
            }else if(i==width-1){
                System.out.println(space);
            }else{
                System.out.print(star);
            }
        }

    }
}

package texc03;

import java.util.Arrays;
import java.util.Scanner;

public class prb02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] ASorted = new int[n];
        int[] B = new int[n];
        for (int i = 0; i<n ; i++){
            A[i] = sc.nextInt();
            ASorted[i] = A[i];
        }
        Arrays.sort(ASorted);
        for (int i = 0; i<n ; i++){
            for(int j = 0; j<n; j++){
                if (ASorted[i]==A[j]){
                    B[i] = j+1;
                    break;
                }
            }
        }
        for (int i=0; i<n; i++){
            System.out.print(B[i]+" ");
        }
    }
}

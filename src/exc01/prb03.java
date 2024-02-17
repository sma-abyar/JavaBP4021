package exc01;
import java.util.Scanner;
public class prb03 {
    public static void main(String[] args) {
        int a,b,c,d,sum,mult,MaxNum1,MaxNum2,MinNum1,MinNum2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 4 number:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        sum = a+b+c+d;
        double dsum = sum;
        mult = a*b*c*d;
        double avg = dsum/4;
        MaxNum1 = Math.max(a, b);
        MaxNum2 = Math.max(c, d);
        MinNum1 = Math.min(a, b);
        MinNum2 = Math.min(c, d);
        System.out.print(sum + " ");
        System.out.print(mult + " ");
        System.out.print(avg + " ");
        System.out.print(Math.max(MaxNum1, MaxNum2) + " ");
        System.out.print(Math.min(MinNum1, MinNum2) + " ");
    }
}

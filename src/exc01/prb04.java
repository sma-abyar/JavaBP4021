package exc01;
import java.util.Scanner;
public class prb04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 number: ");
        int a,b,sum,mult;
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        mult = a*b;
        System.out.print("Your function is: x^2+("+-sum+")x+("+mult+")");
    }
}

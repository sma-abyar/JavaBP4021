package exc01;
import java.util.Scanner;
public class prb05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your salary:  ");
        double salary = sc.nextDouble();
        double finalFee,lv1,lv2,lv3,lv4;
        lv4 = Math.max(salary-30,0);
        lv3 = Math.max(salary-25-lv4,0);
        lv2 = Math.max(salary-15-lv4-lv3,0);
        lv1 = Math.max(salary-6-lv2-lv3-lv4,0);
        finalFee = lv1*0.1 + lv2*0.15 + lv3*0.25 + lv4*0.35;
/*        System.out.println(lv1);
        System.out.println(lv2);
        System.out.println(lv3);
        System.out.println(lv4);
        System.out.println(finalFee);
 */
        System.out.printf("%.3f",finalFee);
    }
}
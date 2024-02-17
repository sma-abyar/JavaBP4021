package texc01;
import java.util.Scanner;
public class prb03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = (b-a)*(b+a+1)/2;
        System.out.println(c);
    }
}

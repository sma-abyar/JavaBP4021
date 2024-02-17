package texc01;
import java.util.Scanner;
public class prb02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a%b;
        System.out.println(b-c);
    }
}

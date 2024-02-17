package texc01;
import java.util.Scanner;
public class prb04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1,x2,y1,y2;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        double width,height;
        width = Math.pow(x1-x2,2);
        height = Math.pow(y1-y2,2);
        System.out.println((int)(width+height));
    }
}

package texc01;
import java.util.Scanner;
public class prb01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width,height;
        width = sc.nextInt();
        height= sc.nextInt();
        long total = (long) width *height;
        long finalResualt;
        finalResualt = (long) Math.floor((double) total /2);
        System.out.println(finalResualt);
    }
}

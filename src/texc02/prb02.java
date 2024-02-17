package texc02;

import java.util.Scanner;

public class prb02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, n;
        n = 2;
        number = sc.nextInt();
        while (n <= number){
            int power = 0;
            boolean isPrime = true;
            int primeNumber = 0;
            int i = 2;
            while (i<n){
                if (n%i == 0){
                    isPrime = false;
                }
                i++;
            }
            if (isPrime) {
                primeNumber = n;
                int newNum = number;
                while (true) {
                    if (newNum % primeNumber == 0) {
                        newNum /= primeNumber;
                        power++;
                    } else {
                        if (power!=0){
                            System.out.println(primeNumber + " " + power);
                            break;
                        }
                        break;
                    }
                }
            }
            n++;
        }
    }
}

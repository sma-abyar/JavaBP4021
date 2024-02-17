package exc08;

public class prb08 {

    public static int countMatrix(int n, boolean[] matrix) {
        if (n == 0) {
            return 1;
        } else {
            if (!matrix[n-1]){
                matrix[n-1] = true;
                return countMatrix(n - 1, matrix) + n;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        boolean[] matrix = new boolean[n];
        for (int i=0; i<n;i++){
            matrix[i] = false;
        }
        int count = countMatrix(n, matrix);
        System.out.println(count);
    }
}


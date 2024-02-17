package exc04;

import java.util.Scanner;

public class prb03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int echar=0;
        String[][] alter = new String[2][2];
        String[][] aws = new String[num][3];
        String[] taghal = new String[num];
        String[] ntaghal = new String[num];
        boolean[] end = new boolean[num];
        for (int i = 0; i<num; i++){
            aws[i][0] = sc.next();
            aws[i][1] = sc.nextLine();
            aws[i][2] = "";
        }
        for(int i =0; i<num; i++){
            if(aws[i][1].equals(" ")){
                aws[i][2] = "false";
                continue;
            }
            alter[0][0] = aws[i][0];
            alter[0][1] = aws[i][1];
            for(int k=0; k<num;k++){
                if (aws[k][0].equals(alter[0][0])){
                    echar = 0;
                    continue;
                }else {
                    double moj = aws[i][1].length();
                    moj += aws[k][1].length();
                    int max = (int) Math.floor(moj/4);
                    for(int j=0; j< alter[0][1].length();j++){
                        for (int x=0; x< aws[k][1].length(); x++) {
                            if (alter[0][1].charAt(j) == aws[k][1].charAt(x)) {
                                echar++;
                            }
                        }
                    }if (echar>max){
                        taghal[i] = aws[k][0];
                        aws[i][2] = "true";
                    }else {
                        if(aws[i][2].equals("true")){
                            continue;
                        }else {
                            ntaghal[i] = alter[0][0];
                            aws[i][2] = "false";
                        }
                    }
                }
                echar = 0;
            }
        }
        /*for(int i =0; i<num; i++){
            if (aws[i][2].equals("true")){
                System.out.println(aws[i][0]+" ");
            }else {
                System.out.println("no cheat for "+aws[i][0]);
            }
        }*/
        for (int i =0; i<num; i++){
            if (ntaghal[i]!=(null) && aws[i][2].equals("false")){
                System.out.println("no cheat for "+ntaghal[i]);
            }
        }
        for (int i =0; i<num; i++){
            if (taghal[i]!=(null)){
                System.out.println(taghal[i]);
            }
        }
    }
}
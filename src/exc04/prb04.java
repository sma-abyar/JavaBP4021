package exc04;

import java.util.Scanner;

public class prb04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        String passInput = sc.next();
        int num =1;
        if (passInput.length()==1){
            builder.append(passInput);
        }
        for(int i=0; i< passInput.length()-1; i++){
            char a = passInput.charAt(i), b = passInput.charAt(i+1);
            if (a=='0'||a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9'){
                builder.append(a);
            }else if(a == b && i == passInput.length()-2){
                num++;
                builder.append(a);
                builder.append(num);
            }else if(a == b){
                num++;
            }else if(a != b){
                builder.append(a);
                if (num!=1){
                    builder.append(num);
                }if ((b=='0'||b=='1'||b=='2'||b=='3'||b=='4'||b=='5'||b=='6'||b=='7'||b=='8'||b=='9') && num!=1){
                    builder.append(',');
                }
                num =1;
            }if ((b=='0'||b=='1'||b=='2'||b=='3'||b=='4'||b=='5'||b=='6'||b=='7'||b=='8'||b=='9')&&i == passInput.length()-2){
                builder.append(b);
            }else if (i == passInput.length()-2 && a!=b){
                builder.append(b);
            }
        }
        String result = builder.toString();
        System.out.println(result);
    }
}

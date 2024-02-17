package exc04;

import java.util.Scanner;
public class prb05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String playerRed = sc.nextLine();
        String playerBlue = sc.nextLine();
        int col =  sc.nextInt(), row = sc.nextInt(), num = sc.nextInt();
        if(row==0||col==0||num==0){
            System.out.println("Tie!");
            return;
        }
        int m =0,n=0;
        int y=0,z=0;
        char[][] table= new char[col][row];
        for(int i =0;i<col;i++ ){
            for(int j =0;j<row;j++) {
                String ao =sc.next();
                char[] ch =ao.toCharArray();
                for(int k=0;k<ch.length;k++){
                    table[i][j] = ch[0];
                }

            }
        }
        int alter = 0;
        for(int o =0;o<row*col&&y<col&&z<row;o++){
             for(int i =y;i<col;i++ ){
                for(int j =z;j<row;j++){
                    if(table[i][j] == 'r'){
                        m = i;
                        n = j;
                        break ;
                    }else if(table[i][j] == 'b') {
                        m = i;
                        n = j;
                        break ;
                    }
                }
            }
            int method1=1, method2=1, method3=1, method4=1;
            for(int i = m +1;i<col;i++ ){
                if(table[i][n] == table[m][n]){
                    method1++;
                }else {
                    break;
                }
            }
            for(int i =n-1, j =m+1;i<row&&j<col&&i>=0&&j>=0;i=i-1,j=j+1){
                if(table[j][i] == table[m][n]){
                    method4++;
                }else {
                    break;
                }
            }
            for(int i =n +1;i<row;i++ ){
                if(table[m][i] == table[m][n]){
                    method2++;
                }else {
                    break;
                }
            }
            for(int i =m -1;i<col&&i>0;i=i-1 ){
                if(table[i][n] == table[m][n]){
                    method1++;
                }else {
                    break;
                }
            }
            for(int i =n+1, j =m+1;i<row&&j<col;i=i+1,j=j+1){
                if(table[j][i] == table[m][n]){
                    method3++;
                }else {
                    break;
                }
            }
            for(int i =n-1, j =m-1;i<row&&j<col&&i>=0&&j>=0;i=i-1,j=j-1){
                if(table[j][i] == table[m][n]){
                    method3++;
                }else {
                    break;
                }
            }
            for(int i =n -1;i<row&&i>0;i=i-1 ){
                if(table[m][i] == table[m][n]){
                    method2++;
                }else {
                    break;
                }
            }
            for(int i =n+1, j =m-1;i<row&&j<col&&i>=0&&j>=0;i=i+1,j=j-1){
                if(table[j][i] == table[m][n]){
                    method4++;
                }else {
                    break;
                }
            }

            if(method2>=num  ){alter=1;
                break;
            }else if(method1>=num){alter=1;
                break;
            }else if (method3>=num){alter=1;
                break;
            }else if (method4>=num){alter=1;
                break;
            }else if (num==1){alter=1;
                break;
            }
            z++;
            if (z==row){
                z=0;
                y++;
            }
        }
        if(table[m][n] == 'r'&&alter==1){
            System.out.println(playerRed);
        }
        else if(table[m][n] == 'b'&&alter==1) {
            System.out.println(playerBlue);
        }else{
            System.out.println("Tie!");
        }
    }
}


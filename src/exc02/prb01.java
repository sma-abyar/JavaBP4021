package exc02;

import java.util.Scanner;

public class prb01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender, color;
        gender = sc.next();
        color = sc.next();
        int size;
        size = sc.nextInt();
        /*if (gender.equals("girl")){
            if (color.equals("white")){
                if (size<30 && size>=25){
                    System.out.println("parisa");
                }
            }
        }if (gender.equals("boy")){
            if (color.equals("black")){
                if (size<40 && size>=35){
                    System.out.println("mehdi");
                }
            }
        }if (gender.equals("girl")){
            if (color.equals("black")){
                if (size<40 && size>=30){
                    System.out.println("sayna");
                }
            }
        }if (gender.equals("boy")){
            if (color.equals("white")){
                if (size<60 && size>=50){
                    System.out.println("mohammadreza");
                }
            }
        }if (gender.equals("girl")){
            if (color.equals("white")){
                if (size<25 && size>=20){
                    System.out.println("minoo");
                }
            }
        }if (gender.equals("boy")){
            if (color.equals("black")){
                if (size<2023 && size>=55){
                    System.out.println("bamdad");
                }
            }
        }if (gender.equals("girl")){
            if (color.equals("black")){
                if (size<19 && size>=1){
                    System.out.println("fatemeh");
                }
            }
        }if (gender.equals("boy")){
            if (color.equals("white")){
                if (size<50 && size>=40){
                    System.out.println("ahmad");
                }
            }
        }else {
            System.out.println("No People Found");
        }*/
        if (gender.equals("girl")){
            if (color.equals("white")){
                if (size<30 && size >= 25){
                    System.out.println("parisa");
                }else if(size<25 && size>=20){
                    System.out.println("minoo");
                }else{
                    System.out.println("No People Found");
                }
            }else if (color.equals("black")){
                if (size<40 && size>=30){
                    System.out.println("sayna");
                }else if(size<19 && size>=1){
                    System.out.println("fatemeh");
                }else {
                    System.out.println("No People Found");
                }
            }else{
                System.out.println("No People Found");
            }
        }else if (gender.equals("boy")){
            if (color.equals("white")){
                if(size<60 && size>=50){
                    System.out.println("mohammadreza");
                }else if(size<50 && size>=40){
                    System.out.println("ahmad");
                }else {
                    System.out.println("No People Found");
                }
            }else if (color.equals("black")){
                if(size<40 && size>=35){
                    System.out.println("mehdi");
                }else if(size<2023 && size>=55){
                    System.out.println("bamdad");
                }else {
                    System.out.println("No People Found");
                }
            }else {
                System.out.println("No People Found");
            }
        }
        else {
            System.out.println("No People Found");
        }
    }
}
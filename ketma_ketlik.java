package com.company;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("n = ");
        int  n =scanf.nextInt();
        int k = 0,l = 0,m,min,max;
        int number =scanf.nextInt();
     //1-masala

      /*  min = number; max = number ;
        for (int i =1;i<n;i++){
            number =scanf.nextInt();
            if (number > max) max =number;
            if (number < min) min =number;
        }
        System.out.println("max : "+max);
        System.out.println("min : "+min);
    //2-masala
        min = number; max = number ;
        for (int i =1;i<n;i++){
            number =scanf.nextInt();
            if (number > max) max =number;
            if (number < min) min =number;
        }
        System.out.println("a tomoni : "+max);
        System.out.println("b tomoni  : "+min);
    //3-masala

        //CHIQMADI

    //4-masala
        min = number;
        for (int i =1;i<n;i++){
            number =scanf.nextInt();
            if (number <min) {
                min =number;
                l=i;
            }
        }
        System.out.println(l);
     //5-masala
           for (int i=1;i<n;i++){
               number=scanf.nextInt();
           }
        int number2 =scanf.nextInt();
           for (int i=1;i<n;i++){
               number2 =scanf.nextInt();
           }
           min =number2/number;
         for (int j =0;j<n;j++){
             if (number2/number < min) min=number2/number;
         }
        System.out.println("hajm : "+number);
        System.out.println("massa : "+number2);*/
     //6-masala
        min = number; max = number ;
        for (int i =1;i<n;i++){
            number =scanf.nextInt();
            if (number > max) max =number;
            if (number < min)
                min =number;
        }
        System.out.println("max : "+max);
        System.out.println("min : "+min);
     //7-masala
           
    }
}

//Посысаев Георгий ИКБО-03-19
package ru.mirea.lab1;
import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        int[] b= new int[5];
        double n =1 ;
        double k =2;

        for (int i=0;i<10;i++) {
            System.out.println(n);
            n = n + (1 / k);
            k++;
        }

    }
}


//Посысаев Георгий ИКБО-03-19 4е задание лабораторной работы
package ru.mirea.lab1;
import java.util.Scanner;
public class qwe {
    public static void main(String[] args) {
        int[] array;
        array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 12) + 15);
            System.out.println(array[i]);
        }
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( array[j] > array[j+1] ){
                int tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
            }
        }
    }  System.out.println("Отсортированный массив");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);}
        }
    }


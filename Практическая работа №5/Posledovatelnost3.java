package practica5.posysaev;

import java.util.Scanner;

public class Posledovatelnost3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше число A: ");
        int A = in.nextInt();
        System.out.println("Введите ваше число B: ");
        int B = in.nextInt();
        Posledovatelnost3 q = new Posledovatelnost3();
        q.Vivod(A,B);
    }
    void Vivod(int A, int B) {
        if(A>B){
            int y = A;
            for(A=y;A>B;A--){
                System.out.println(A+ "  ");
            }
        }
        if(B>A){
            int r=A;
            for(A=r;A<B+1;A++){
                System.out.println(A+ "  ");
            }
        }
    }
}

package practica5.posysaev;
import java.util.Scanner;
public class Posledovatelnost2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше число n: ");
        int n = in.nextInt();
        Posledovatelnost2 q = new Posledovatelnost2();
        q.Vivod(n);
    }
    void Vivod(int n) {
        int r=1;
        while (r!=n+1){
            System.out.println(r+ "   ");
            r++;
        }
    }
}

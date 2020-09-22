package practica5.posysaev;
import java.util.Scanner;
public class Posledovatelnost {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше число n: ");
        int n = in.nextInt();
        Posledovatelnost q = new Posledovatelnost();
        q.Vivod(n);
    }
    int Vivod(int n) {
        int i = 0;
        int y = 1;
        int k = 1;
        int u = 0;

        while (y != n) {
            if (u == n) {
                System.exit(0);
            }
            for (i = 0; i < y; i++) {
                System.out.println(k + "  ");
                u++;
                if (u == n) {
                    System.exit(0);
                }
            }
            y++;
            k++;

        }
    return 0;
    }
}

package balls;
public class TestBalls {
    public static void main(String[] args) {
        Ball b1 = new Ball(15, 10);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}

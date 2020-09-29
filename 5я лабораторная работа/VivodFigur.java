package lab5;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class VivodFigur extends JFrame {

    public static int i = 1;

    public static Shape getRandomShape() {
        Random random = new Random();
        int width = random.nextInt(50) + 50;
        int height = random.nextInt(50) + 50;
        int x = getRandomIntegerBetweenRange(2,250);
        int y = getRandomIntegerBetweenRange(2,250);

        Color color = getRandomColor(random.nextInt(10));
        switch (random.nextInt(2)) {
            case 0:
                return new Circle(x, y, color, width / 2);
            case 1:
                return new Rectangle(x, y, color,  width, height);
        }
        return new Circle(x, y, color,  width / 2);
    }

    private static Color getRandomColor(int i) {
        switch (i) {
            case 0:
                return Color.RED;
            case 1:
                return Color.BLUE;
            case 2:
                return Color.CYAN;
            case 3:
                return Color.GRAY;
            case 4:
                return Color.GREEN;
            case 5:
                return Color.YELLOW;
            case 6:
                return Color.LIGHT_GRAY;
            case 7:
                return Color.MAGENTA;
            case 8:
                return Color.ORANGE;
            case 9:
                return Color.PINK;
        }
        return Color.RED;
    }
    public static int
    getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
    public VivodFigur() {
        super(" Фигурки");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        for (int j = 0; j < 20; j++) {
            Shape figure = getRandomShape();
            figure.setBounds(0, 0, 800, 450);
            lp.add(figure);
        }
        setSize(700, 700);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VivodFigur().setVisible(true);
    }
}

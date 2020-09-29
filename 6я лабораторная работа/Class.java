package lab6;

import java.util.Timer;
import java.util.TimerTask;
import java.lang.Thread;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Class extends JFrame {
    JPanel pnl = new JPanel();
    JPanel pnl2 = new JPanel();
    JTextField text;
    int y = 3;

    public Class() {
        super("Текстовые поля");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(340, 400);
        setLayout(new BorderLayout());
        pnl.setLayout(null);
        pnl2.setLayout(null);
        add(pnl);
        pnl.add(pnl2);
        JButton btn1 = new JButton("Проверить");
        btn1.setBounds(110, 50, 120, 30);
        pnl.add(btn1);
        text = new JTextField(20);
        text.setBounds(70, 10, 200, 20);
        pnl.add(text);
        JLabel label1 = new JLabel("<html>Угадай число. Выберите число от 1 до 20. Далее вы узнаете больше или меньше загаданное число выбранного вами числа. У вас 3 попытки</html>");
        label1.setBounds(10, 10, 300, 300);
        setLocationRelativeTo(null);
        pnl.add(label1);
        int m = getRandomIntegerBetweenRange(1, 20);


        btn1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


                String s = text.getText();
                int i = Integer.parseInt(s);

                    int k = 0;
                    if (i == m) {

                            label1.setText("Поздравляю, вы угадали число!");
                            new Reminder(5);

                    }

                    if (i > m) {
                        y--;
                        label1.setText("<html>Загаданное число меньше, у вас осталось  "+ y +"<html>  попыток</html>");
                    }
                    if (i < m) {
                        y--;
                        label1.setText("<html>Загаданное число больше, у вас осталось   "+ y +"<html>  попыток</html>");
                    }
                    if(y==0){
                        label1.setText("<html>Ваши попытки закончились</html>");
                        new Reminder(5);
                    }


                }


            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
    public static int getRandomIntegerBetweenRange(int min, int max) {
        int x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

        public static void main (String[]args){
            new Class().setVisible(true);

    }
}
class Reminder {

    Timer timer;

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.exit(0);
            timer.cancel();
        }
    }}


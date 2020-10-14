package lab8;
import java.io.*;

public class Test {
    public static void main(String[] args) {
       try( FileWriter writer = new FileWriter("C:\\Users\\Пользователь\\Desktop\\qwerty.txt", true)){
           String text = "А сейчас где?";
           writer.append('\n');
           writer.write(text);
           writer.flush();
        }
       catch (IOException ex){
           System.out.println(ex.getMessage());
       }

    }
}

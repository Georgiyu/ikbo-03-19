package i.ystal.aaaaaa;

public class PITBUL extends Dog
{
    public PITBUL(String poroda, String color, int vozrast) {
    super(poroda,color,vozrast);
    }

    public String toString() {
        return "Питбуль {\n" +
                "\t\tпорода = " + getPoroda() + "\n" +
                "\t\tвозраст = " + getVozract() + " лет\n" +
                "\t\tцвет = " + getColor() + " }";
    }
}

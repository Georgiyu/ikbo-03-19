package i.ystal.aaaaaa;

abstract class Dog {
    public String poroda, color;
    public int vozract;
    Dog(String poroda, String color, int vozract){
        this.color = color;
        this.poroda = poroda;
        this.vozract = vozract;
    }

    public String getColor() {
        return color;
    }

    public int getVozract() {
        return vozract;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVozract(int vozract) {
        this.vozract = vozract;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "poroda='" + poroda + '\'' +
                ", color='" + color + '\'' +
                ", vozract=" + vozract +
                '}';
    }
}

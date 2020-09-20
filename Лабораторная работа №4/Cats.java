package labs4.posysaev;

public class Cats implements Priceable {
    private double price;
    public Cats(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "price=" + price +
                '}';
    }
}

package labs4.posysaev;

public class Cars implements Priceable {
    private double price;
    public Cars(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "price=" + price +
                '}';
    }
}

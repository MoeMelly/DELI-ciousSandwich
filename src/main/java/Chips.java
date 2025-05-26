public class Chips {
    double price;
    String size;


    public Chips(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public double chipPrice(String size) {
        if (size.equals("S")) {
            price = 1.50;
        } else {
            throw new IllegalStateException("Unexpected value" + size);
        }
        return 0;
    }

}

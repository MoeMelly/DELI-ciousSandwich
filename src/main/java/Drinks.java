import java.io.Serializable;

public class Drinks implements Serializable {
    double price;
    Size size;


    public Drinks(double price, Size size) {
        this.price = price;
        this.size = size;
    }

    public double getPrices(Size size) {

        return switch (size) {
            case SMALL -> 2.00;
            case MEDIUM -> 2.50;
            case LARGE -> 3.00;
        };
    }

    @Override
    public String toString() {
        return String.format("Drink Size: %s | Price: $%.2f", size , price);
    }


}



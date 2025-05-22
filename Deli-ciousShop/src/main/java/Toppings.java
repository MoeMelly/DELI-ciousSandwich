import java.io.Serializable;
import java.util.List;

import static java.io.File.separator;

public class Toppings implements Serializable {
    String type;
    double price;
    boolean isExtra;




    public Toppings(String type, double price, boolean isExtra) {
        this.type = type;
        this.price = price;
        this.isExtra = isExtra;
    }




    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void getDescription() {

    }

    @Override
    public String toString() {
            return separator + System.lineSeparator() +
                    type+ System.lineSeparator() +
                    price + System.lineSeparator() +
                    isExtra + System.lineSeparator() +
                    separator;
        }
    }


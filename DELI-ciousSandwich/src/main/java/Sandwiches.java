import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import static java.io.File.separator;

public class Sandwiches implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private final Size breadType;
    private final Size breadSize;
    private final boolean wantToast;
    private final Drinks drinks;
    private final Chips chips;
    List<Toppings> toppings;

    public Sandwiches(Size breadType, Size breadSize, boolean wantToast,Drinks drink, Chips chips, List<Toppings> toppings) {
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.wantToast = wantToast;
        this.drinks = drink;
        this.chips = chips;
        this.toppings = toppings;

    }

    public Size getBreadSize() {
        return breadSize;
    }

    public Size getBreadType() {
        return breadType;
    }

    public boolean isWantToast() {
        return wantToast;
    }

    @Override
    public String toString() {
        return separator + System.lineSeparator()
                + "Bread Type: " + breadType + System.lineSeparator()
                + "Bread Size: " + breadSize + System.lineSeparator()
                + "Toasted: " + wantToast + System.lineSeparator()
                + separator;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public Chips getChips() {
        return chips;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }


    }






import java.io.Serializable;

import static java.io.File.separator;

public class Sandwiches implements Serializable {
    BreadType breadType;
    BreadType.BreadSize breadSize;
    boolean wantToast;


    public Sandwiches(BreadType breadType, BreadType.BreadSize breadSize, boolean wantToast) {
        if (!breadType.getAvailableSize().contains(breadSize)) {
            throw new IllegalArgumentException("Invalid size " + breadSize + " for bread type " + breadType);
        }
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.wantToast = wantToast;
    }


    public BreadType.BreadSize getBreadSize() {
        return breadSize;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    @Override
    public String toString() {
        return separator + System.lineSeparator() +
                breadType + System.lineSeparator() +
                breadSize + System.lineSeparator() +
                separator;
    }

    public boolean isWantToast() {
        if (wantToast) {
            System.out.println();
        }


        return wantToast;
    }
}


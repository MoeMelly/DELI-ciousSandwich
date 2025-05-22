import java.util.Map;
import java.util.Set;

public enum BreadType {
    WHITE(Map.of(
            BreadSize.SMALL, 5.50,
            BreadSize.MEDIUM, 7.00,
            BreadSize.LARGE, 8.50
    )),
    WHEAT(Map.of(
            BreadSize.SMALL, 5.50,
            BreadSize.MEDIUM, 7.00,
            BreadSize.LARGE, 8.50
    )),

    RYE(Map.of(
            BreadSize.SMALL, 5.50,
            BreadSize.MEDIUM, 7.00,
            BreadSize.LARGE, 8.50
    )),

    WRAP(Map.of(
            BreadSize.SMALL, 5.50,
            BreadSize.MEDIUM, 7.00,
            BreadSize.LARGE, 8.50
    ));


    private final Map<BreadSize, Double> sizePriceMap;


    BreadType(Map<BreadSize, Double> sizePriceMap) {
        this.sizePriceMap = sizePriceMap;
    }
    public double getPrice(BreadSize size) {
        return sizePriceMap.getOrDefault(size,0.0);

    }
    public Set<BreadSize> getAvailableSize() {
        return sizePriceMap.keySet();
    }

    enum BreadSize {
        SMALL,
        MEDIUM,
        LARGE,
    }


    }





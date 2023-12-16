import java.util.UUID;

public class CoffeeOrder {

    private final UUID orderNumber;
    private final CoffeeType coffeeType;

    public CoffeeOrder(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
        this.orderNumber = UUID.randomUUID();
    }

    public UUID getOrderNumber() {
        return orderNumber;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }
}

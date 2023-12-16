public enum CoffeeType {

    ESPRESSO(100),
    LATTE(200),
    CAPPUCCINO(300),
    AMERICANO(400),
    MOCHA(500);

    private int price;

    CoffeeType(int price) {
        this.price = price;
    }

    private int getPrice() {
        return price;
    }

}

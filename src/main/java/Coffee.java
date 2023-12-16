import java.util.ArrayList;
import java.util.List;

class Coffee {


    public static void main(String[] args) {

        // Note the type of these is CoffeeMchine but the actual type is ExpressMaker and RegularCoffeeMaker
        CoffeeMachine espressoMaker = new EspressoMaker();
        CoffeeMachine regularCoffeeMaker = new RegularCoffeeMaker();

        List<CoffeeOrder> orders = new ArrayList<>();
        orders.add(new CoffeeOrder(CoffeeType.LATTE));
        orders.add(new CoffeeOrder(CoffeeType.CAPPUCCINO));
        orders.add(new CoffeeOrder(CoffeeType.AMERICANO));
        orders.add(new CoffeeOrder(CoffeeType.ESPRESSO));
        orders.add(new CoffeeOrder(CoffeeType.ESPRESSO));
        orders.add(new CoffeeOrder(CoffeeType.MOCHA));

        // All the non espresso orders - these can be made using the standard coffee machine
        orders.stream()
                .filter(order -> order.getCoffeeType() != CoffeeType.ESPRESSO)
                .map(CoffeeOrder::getCoffeeType)
                .forEach(regularCoffeeMaker::brewCoffee);

        //Brew espresso using the espresso maker
        orders.stream()
                .filter(order -> order.getCoffeeType() == CoffeeType.ESPRESSO)
                .map(CoffeeOrder::getCoffeeType)
                .forEach(espressoMaker::brewCoffee);


    }


    ;


}

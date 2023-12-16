import javax.swing.plaf.BorderUIResource;
import java.util.ArrayList;
import java.util.List;

class Coffee {


    public static void main(String[] args) {

        List<CoffeeOrder>  orders = new ArrayList<>();
        orders.add(new CoffeeOrder(CoffeeType.LATTE));
        orders.add(new CoffeeOrder(CoffeeType.CAPPUCCINO));
        orders.add(new CoffeeOrder(CoffeeType.AMERICANO));
        orders.add(new CoffeeOrder(CoffeeType.ESPRESSO));
        orders.add(new CoffeeOrder(CoffeeType.ESPRESSO));
        orders.add(new CoffeeOrder(CoffeeType.MOCHA));


        for (CoffeeOrder order: orders) {
            System.out.println(order.getCoffeeType());
        }

        // map takes the original stream of coffee orders and maps it into
        // a stream of coffee types
        orders.stream().map(CoffeeOrder::getCoffeeType).forEach(System.out::println);

        System.out.println("Filtering out espresso orders");


        var filteredOrders =  orders.stream()
                .filter(order -> order.getCoffeeType() != CoffeeType.ESPRESSO)
                .map(CoffeeOrder::getCoffeeType).toList();


         filteredOrders.forEach(System.out::println);




    }



    ;


}

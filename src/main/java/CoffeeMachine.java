public interface CoffeeMachine {

   default  void  brewCoffee(CoffeeType coffeeType)  {
         System.out.println("Brewing coffee: " + coffeeType);
   }


}

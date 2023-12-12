public class FizzBuzz {
    public FizzBuzz() {
    }

    public static String fizzBuzz(int inputNumber) {

        if (isDivisibleBy5And3(inputNumber)) {
            return "FizzBuzz";
        }

        if (isDivisibleBy3(inputNumber)) {
            return "Fizz";
        }

        if (isDivisibleBy5(inputNumber)){
            return "Buzz";
        }

        return "i";
        

    }

    private static boolean isDivisibleBy5(int inputNumber) {
        return inputNumber % 5 == 0;
    }

    private static boolean isDivisibleBy3(int inputNumber) {
        return inputNumber % 3 == 0;
    }

    private static boolean isDivisibleBy5And3(int inputNumber) {
        return isDivisibleBy5(inputNumber) && isDivisibleBy3(inputNumber);
    }
}

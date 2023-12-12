public class FizzBuzz {
    public FizzBuzz() {
    }

    public static String fizzBuzz(int inputNumber) {
//      if divisible by 5 and 3 its FizzBuzz
        if (isDivisibleBy5And3(inputNumber)) {
            return "FizzBuzz";
        }
//      if divisible by 3 but not 5 its Fizz
        else if (isDivisibleBy3(inputNumber)) {
            return "Fizz";
        }
//      if divisible by 5 but not 3 its Buzz
        else if (isDivisibleBy5(inputNumber)){
            return "Buzz";
        }
//      otherwise it should return i
        else {
            return "i";
        }



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

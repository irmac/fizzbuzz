public class FizzBuzz {
    public FizzBuzz() {
    }

    public static String fizzBuzz(int inputNumber) {

        if (isDivisibleByThreeAndFive(inputNumber)) {
            return "FizzBuzz";
        }

        if (isDivisibleByThree(inputNumber)) {
            return "Fizz";
        }

        if (isDivisibleByFive(inputNumber)) {
            return "Buzz";
        }

        return ((Integer)inputNumber).toString();
    }


    private static boolean isDivisibleByFive(int inputNumber) {
        return inputNumber % 5 == 0;
    }

    private static boolean isDivisibleByThree(int inputNumber) {
        return inputNumber % 3 == 0;
    }

    private static boolean isDivisibleByThreeAndFive(int inputNumber) {
        return isDivisibleByFive(inputNumber) && isDivisibleByThree(inputNumber);
    }

}

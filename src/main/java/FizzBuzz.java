public class FizzBuzz {
    public FizzBuzz() {
    }

    public static String fizzBuzz(int inputNumber) {
        if (inputNumber == 15) {
//       deal with multiples of 5
            return "FizzBuzz";
        }
        else if (inputNumber %3 == 0) {
//      deal with multiples of three
            return "Fizz";
        } else {
//       deal with multiples of 5
            return "Buzz";
        }

//       deal with numbers divisible by 5 and 3

    }
}

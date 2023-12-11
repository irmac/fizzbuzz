public class FizzBuzz {
    public FizzBuzz() {
    }

    public static String fizzBuzz(int inputNumber) {
        if ((inputNumber %5 == 0) && (inputNumber %3 ==0)) {
//       deal with multiples of 5
            return "FizzBuzz";
        }
        else if (inputNumber %3 == 0) {
//      deal with multiples of three
            return "Fizz";
        } else if (inputNumber %5 == 0){
//       deal with multiples of 5
            return "Buzz";
        }
        else {
            return "i";
        }



    }
}

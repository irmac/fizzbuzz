
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void shouldReturnFizzFor3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void shouldReturnFizzFor5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

//    @Test
//    void shouldReturnFizzFor15() {
//        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
//    }
}

import org.example.Fizzbuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    @DisplayName("Test si el número es divisible por 3")
    void test_WhenTheNumberIsDivisibleByThree_thenReturnFizz(){
        //Given "dado"
        Fizzbuzz objectOfFizzbuzz = new Fizzbuzz();
        //When "cuando"
        String result = objectOfFizzbuzz.checkNumber(9);
        //Then "pues"
        assertEquals("Fizz", result);

    }
    @Test
    @DisplayName("test si el numero es divisble por 5")
    void test_WhenTheNumberIsDivisibleByFive_thenReturnBuzz() {
        //Given
        Fizzbuzz objectOfFizzbuzz = new Fizzbuzz();
        //When
        String result = objectOfFizzbuzz.checkNumber(10);
        //Then "pues"
        assertEquals("Buzz",result);
    }
    @Test
    @DisplayName("test si el numero es divisible por 3 y 5")
    void test_WhenTheNumberIsDivisibleByThreeAndFive_thenReturnFizzBuzz(){
        //Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        //When
        String result = fizzbuzz.checkNumber(15);
        //Then "pues"
        assertEquals("FizzBuzz",result);
    }
}

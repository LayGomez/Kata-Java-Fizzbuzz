import org.example.NumberList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberListTest {
    @Test
    @DisplayName("Test si en la lista de números hay números que sean divisibles por el número")
    void test_WhenThereAreNumbersIsDivisibleByNumber_thenReturnListOfNumbers() {
        // Given
        NumberList numberlist = new NumberList();
        ArrayList<Integer> numberListArray = new ArrayList<>();
        numberListArray.add(12);
        numberListArray.add(15);
        numberListArray.add(20);
        //When
        ArrayList<Integer> result =numberlist.checkNumber(3, numberListArray);
        //Then
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(12);
        listOfNumbers.add(15);
        assertEquals ( listOfNumbers,result);
    }
}

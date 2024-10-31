import org.example.FilterAdults;
import org.example.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterAdultsTest {
    @Test
    @DisplayName("Test si el usuario es mayor de edad")
    void test_WhenThereAreAgeOfUserIsMajorOfEighteen_theReturnArrayWithAdultsUsers (){
        //Given
        FilterAdults filterAdults = new FilterAdults();
        User[] users = {
                new User("Maria", 20),
                new User ("Layla", 25),
                new User ("Erika", 16),
        };
        //When
        List<User> result = filterAdults.checkAdults(users);
        //Then
        assertEquals( "Layla", result.get(1).getName());
    }
}

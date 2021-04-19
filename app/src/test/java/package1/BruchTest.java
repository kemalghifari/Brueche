package package1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BruchTest {
    @Test
    @DisplayName("showing result after dividing two positive numbers")
    void ersteTest(){
        Bruch test = new Bruch(5,2);
        double ergebnis = test.ausrechnen();
        assertEquals(2.5, ergebnis);
    }
}

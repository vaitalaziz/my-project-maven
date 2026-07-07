import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isPositiveNumber() {
        assertTrue(Main.isPositive(5));
    }

    @Test
    void isNegativeNumber() {
        assertFalse(Main.isPositive(-5));
    }

    @Test
    void shouldMultiplyTwoPositiveNumbers() {
        assertEquals(12, Main.multiply(3, 4));
    }

    @Test
    void shouldMultiplyNegativeNumber(){
        assertEquals(-15, Main.multiply(-3,5));
    }

    @Test
    void shouldReturnFirstLetter() {
        assertEquals("H", Main.getFirstLetter("Hello"));
    }

    @Test
    void shouldReturnNullForNullString() {
        assertNull(Main.getFirstLetter(null));
    }

    @Test
    void shouldReturnNullForEmptyString() {
        assertNull(Main.getFirstLetter(""));
    }

    @Test
    void shouldReturnNotNullForValidString() {
        assertNotNull(Main.getFirstLetter("Java"));
    }

    @Test
    void shouldDivideNumbers() {
        assertEquals(5, Main.divide(10, 2));
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {

        assertThrows(
                IllegalArgumentException.class,
                () -> Main.divide(10, 0)
        );
    }
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.assessment.NextHighestNumber;

class NextHighestNumberTest {

    @Test
    public void testValidInput() {
        String input = "1234";
        int expected = 1243;
        int actual = NextHighestNumber.nextHighestNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecreasingSequence() {
        String input = "4321";
        int expected = -1;
        int actual = NextHighestNumber.nextHighestNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleDigitInput() {
        String input = "9";
        int expected = -1;
        int actual = NextHighestNumber.nextHighestNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testNullInput() {
        String input = null;
        int expected = -1;
        int actual = NextHighestNumber.nextHighestNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyInput() {
        String input = "";
        int expected = -1;
        int actual = NextHighestNumber.nextHighestNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeInput() {
        String input = "-1234";
        int expected = -1;
        int actual = NextHighestNumber.nextHighestNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidStringInput() {
        String input = "abc";
        int expected = -1;
        int actual = NextHighestNumber.nextHighestNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testZeroAsInput() {
        String input = "0";
        int expected = -1;
        int actual = NextHighestNumber.nextHighestNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxIntegerInput() {
        String input = String.valueOf(Integer.MAX_VALUE);
        int expected = -1;
        int actual = NextHighestNumber.nextHighestNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testDoubleValueAsInput() {
        String input = "9.34";
        int expected = -1;
        int actual = NextHighestNumber.nextHighestNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testGreaterThanMaxIntegerInput() {
        String input = String.valueOf(Integer.MAX_VALUE + 1);
        int expected = -1;
        int actual = NextHighestNumber.nextHighestNumber(input);
        assertEquals(expected, actual);
    }
}

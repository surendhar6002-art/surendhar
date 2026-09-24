package com.example.CalculatorProject; // Add this line!

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({
        "5, 2, 3",
        "10, 5, 5",
        "20, 7, 13",
        "7, 2, 5",
        "2, 7, -5",
        "100, 50, 50"
    })
    void testSubtract(int a, int b, int expectedResult) {
        int actualResult = calculator.subtract(a, b);
        assertEquals(expectedResult, actualResult, 
            () -> a + " - " + b + " should equal " + expectedResult);
    }
}
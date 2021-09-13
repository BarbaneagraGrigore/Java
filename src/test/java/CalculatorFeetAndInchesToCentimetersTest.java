import javaChallanges.CalculatorFeetAndInchesToCentimeters;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorFeetAndInchesToCentimetersTest {

    @ParameterizedTest(name = "Check conversion inches to centimeters")
    @ValueSource(doubles = {1})
    public void checkConversionToCentimeters(double number) {
        double expectedConversionResult = number * 2.54;
        double actualConversionResult = CalculatorFeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(number);

        assertEquals(actualConversionResult, expectedConversionResult);
    }
}

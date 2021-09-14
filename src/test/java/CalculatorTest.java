import javaChallanges.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @ParameterizedTest(name = "Multiply 2 by {0}")
    @ValueSource(floats = {32.54F, 2})
    public void checkMultiplyPositive(float number){
        float expectedMultiplyResult = number * 2;
        float actualMultiplyResult = Calculator.multiply(number, 2);

        assertEquals(actualMultiplyResult, expectedMultiplyResult);
    }

    @ParameterizedTest(name = "Multiply 2 by {0}")
    @ValueSource(floats = {120, -8})
    public void checkMultiplyNegative(float number) {
        float actualMultiplyResult = Calculator.multiply(number, 2);

        assertThat("Check multiply conditions. ", actualMultiplyResult, is(0.0F));
    }

    @ParameterizedTest(name = "Subtract {0} from 100")
    @ValueSource(floats = {60, 70})
    public void checkSubtractPositive(float number) {
        float expectedSubtractResult = 100 - number;
        float actualSubtractResult = Calculator.subtract(100, number);

        assertEquals(actualSubtractResult, expectedSubtractResult);
    }

    @ParameterizedTest(name = "Subtract {0} from 100")
    @ValueSource(floats = {-60, 130})
    public void checkSubtractNegative(float number) {
        float actualSubtractResult = Calculator.subtract(100, number);

        assertThat("Check subtract conditions.", actualSubtractResult, is(-1F));
    }

    @ParameterizedTest(name = "Divide 100.12 by {0}")
    @ValueSource(floats = {0})
    public void checkDivideNegative(float number) {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Calculator.divide(100.12F, number));
        String expectedMessage = "Argument 'divisor' is 0";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }


    @ParameterizedTest(name = "Divide 360.5 by {0}")
    @ValueSource(floats = {50, 2})
    public void checkDividePositive(float number) {
        float expectedDivideResult = 360.5F / number;
        float actualDivideResult = Calculator.divide(360.5F, number);

        assertEquals(actualDivideResult, expectedDivideResult);
    }

    @ParameterizedTest
    @CsvSource({"100,2", "200,6.5", "32,2"})
    public void checkDividePositiveCSV(float number, float value) {
        float expectedDivideResult = number / value;
        float actualDivideResult = Calculator.divide(number, value);

        assertEquals(actualDivideResult, expectedDivideResult);
    }

}

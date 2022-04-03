import challanges.CalculatorBoolean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorBooleanTest {
    @Test
    public void checkBooleanResult() {
        String[] array = {"true", "||", "false", "&&", "true"};
        boolean actualResult = CalculatorBoolean.calculateBoolean(array);

        assertTrue(actualResult);
    }

}
import challanges.Encrypter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncryptorTest {
    @Test
    public void checkBooleanResult() {
        String text = "The journey of a thousand miles begins with one step. Lao Tzu";
        String actualResult = Encrypter.textEncryption(text);
        String expectedResult = "Teuewtz hyssieu eoabtp jfneh. oadgoL utmina rhineo nolssT ";

        assertEquals(expectedResult, actualResult);
    }

}
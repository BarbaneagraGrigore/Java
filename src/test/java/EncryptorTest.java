import challanges.Encrypter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncryptorTest {
    @Test
    public void checkBooleanResult() {
        String text = "have a nice day";
        String expectedResult = "hae and via ecy ";

        assertEquals(expectedResult, Encrypter.encryptText(text));
    }
}
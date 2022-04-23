import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CaesarCipherTests {

    private static final int TIMEOUT = 200;

    @Before
    public void setup() {
        //StringBuilder expected = new StringBuilder("EBE");
        //CaesarCipher test = new CaesarCipher();
    }

    @Test(timeout = TIMEOUT)
    public void testEncryptMessage() {
        String expected = "EBE";
        CaesarCipher test = new CaesarCipher();
        String answer = test.encryptMessage("DAD", 1);
        assertEquals(expected, answer);

    }

    @Test(timeout = TIMEOUT)
    public void testEncryptMessageLoop() {
        String expected = "EGAD";
        CaesarCipher test = new CaesarCipher();
        String answer = test.encryptMessage("ZBVY", 5);
        assertEquals(expected, answer);

    }

    @Test(timeout = TIMEOUT)
    public void testDecryptMessage() {
        String expected = "DAD";
        CaesarCipher text = new CaesarCipher();
        String answer = text.decryptMessage("EBE", 1);
        assertEquals(expected, answer);
    }

    @Test(timeout = TIMEOUT)
    public void testFindShiftKey() {
        int expected = 1;
        CaesarCipher text = new CaesarCipher();
        int actual = text.findShiftKey("EBE", "DAD");
        assertEquals(expected, actual);
    }

    @Test(timeout = TIMEOUT)
    public void testFindShiftKeyLongerWord() {
        int expected = 3;
        CaesarCipher text = new CaesarCipher();
        int actual = text.findShiftKey("JLKLHRJX", "MONOKUMA");
        assertEquals(expected, actual);
    }
}

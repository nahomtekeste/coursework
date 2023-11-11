import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dex2HexTest {

    @Test
    public void testConvertToHexWithZero() {
        assertEquals("0", Dex2Hex.convertToHex(0));
    }

    @Test
    public void testConvertToHexWithPositiveNumber() {
        assertEquals("1A", Dex2Hex.convertToHex(26));
    }

    @Test
    public void testConvertToHexWithNegativeNumber() {
        // Assuming you want to handle negative numbers by converting their absolute values
        assertEquals("1A", Dex2Hex.convertToHex(-26));
    }

    // Add more test cases as needed for different scenarios

}

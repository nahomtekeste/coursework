import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Dex2HexTest {

    @Test
    public void testDex2HexConversion() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Provide a sample input for testing
        String[] args = {"255"};
        Dex2Hex.main(args);

        // Restore the original System.out
        System.setOut(System.out);

        // Get the printed output
        String printedOutput = outContent.toString().trim();

        // Verify the expected output
        assertEquals("Converting the Decimal Value 255 to Hex...\nHexadecimal representation is: FF", printedOutput);
    }
}

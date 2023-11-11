import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class Dex2HexTest {

    @Test
    public void testConvertToHex() {
        assertEquals("1", Dex2Hex.convertToHex(1));
        assertEquals("A", Dex2Hex.convertToHex(10));
        assertEquals("1A", Dex2Hex.convertToHex(26));
        assertEquals("64", Dex2Hex.convertToHex(100));
        assertEquals("7FFFFFFF", Dex2Hex.convertToHex(Integer.MAX_VALUE));
    }

    @Test
    public void testMainWithValidInput() {
        // Redirect standard output to capture log messages
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Dex2Hex.main(new String[]{"255"});
        assertEquals("Hexadecimal representation is: FF\n", outContent.toString());

        // Reset standard output
        System.setOut(System.out);
    }

    @Test
    public void testMainWithInvalidInput() {
        // Redirect standard output to capture log messages
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Dex2Hex.main(new String[]{"abc"});
        assertEquals("Invalid input. Please provide a valid integer.\n", outContent.toString());

        // Reset standard output
        System.setOut(System.out);
    }

    @Test
    public void testMainWithNegativeInput() {
        // Redirect standard output to capture log messages
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Dex2Hex.main(new String[]{"-5"});
        assertEquals("Please provide a non-negative integer argument.\n", outContent.toString());

        // Reset standard output
        System.setOut(System.out);
    }

    @Test
    public void testMainWithNoInput() {
        // Redirect standard output to capture log messages
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Dex2Hex.main(new String[]{});
        assertEquals("Please provide a single integer argument.\n", outContent.toString());

        // Reset standard output
        System.setOut(System.out);
    }
}

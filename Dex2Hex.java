import java.util.Scanner;
import java.util.logging.Logger;

public class Dex2Hex {
    private static final Logger logger = Logger.getLogger(Dex2Hex.class.getName());

    private Dex2Hex() {
        // Private constructor to hide the implicit public one
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            logger.severe("Please provide a single integer argument.");
            return;
        }

        try {
            int decimal = Integer.parseInt(args[0]);
            if (decimal < 0) {
                logger.severe("Please provide a non-negative integer argument.");
            } else {
                String hexadecimal = convertToHex(decimal);
                logger.info("Hexadecimal representation is: " + hexadecimal);
            }
        } catch (NumberFormatException e) {
            logger.severe("Invalid input. Please provide a valid integer.");
        }
    }

    public static String convertToHex(int decimal) {
        char[] hexChars = "0123456789ABCDEF".toCharArray();
        StringBuilder hexadecimal = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal.insert(0, hexChars[remainder]);
            decimal = decimal / 16;
        }

        return hexadecimal.toString();
    }
}

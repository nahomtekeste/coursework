import java.util.Scanner;

public class Dex2Hex {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single integer argument.");
            return;
        }

        try {
            int decimal = Integer.parseInt(args[0]);
            if (decimal < 0) {
                System.out.println("Please provide a non-negative integer argument.");
            } else {
                String hexadecimal = convertToHex(decimal);
                System.out.println("Hexadecimal representation is: " + hexadecimal);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
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

// this is new changes

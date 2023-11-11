public class Dex2Hex {

    public static int Arg1;

    public static void main(String args[]) {
        Arg1 = Integer.parseInt(args[0]);
        String hexadecimal = convertToHex(Arg1);
        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }

    public static String convertToHex(int decimal) {
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        int num = decimal;
        String hexadecimal = "";

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        return hexadecimal;
    }
}


public class RomanToInteger {
    public static int romanToInteger(String roman) {
        // Define the values of Roman numerals
        int[] values = {1000, 500, 100, 50, 10, 5, 1};
        String symbols = "MDCLXVI";

        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char c = roman.charAt(i);
            int index = symbols.indexOf(c);

            if (index == -1) {
                throw new IllegalArgumentException("Invalid Roman numeral character: " + c);
            }

            int value = values[index];

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX"; // Example Roman numeral
        int integerResult = romanToInteger(romanNumeral);
        System.out.println(integerResult); // This will print 9
    }
}
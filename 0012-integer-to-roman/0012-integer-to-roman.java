/**
 * Algorithm:
 * 1. Create two arrays: one for integer values and one for their Roman numeral symbols.
 * 2. Start with the given number num.
 * 3. For each value in the array:
 * 4. While num is greater than or equal to this value:
 * 5. Append the corresponding symbol to the result.
 * 6. Subtract the value from num.
 * 7. Continue until num becomes 0.
 * 8. Return the built Roman numeral string.
 */


class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {
                "M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"
        };

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }
}
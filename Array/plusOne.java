
public class plusOne {

    class Solution {

        public int[] plusOne(int[] digits) {
            int n = digits.length;

            // Iterate from the last digit to the first
            for (int i = n - 1; i >= 0; i--) {
                // If the digit is less than 9, we just increment and return
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }

                // If the digit is 9, it becomes 0 (carry to the next iteration)
                digits[i] = 0;
            }

            // If we reach here, it means all digits were 9 (e.g., 999 -> 1000)
            int[] newNumber = new int[n + 1];
            newNumber[0] = 1; // The rest are initialized to 0 by default in Java
            return newNumber;
        }
    }

    public static void main(String[] args) {

    }
}

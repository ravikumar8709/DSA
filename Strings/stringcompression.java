
import java.util.Scanner;

class stringcompression {

    public int compress(char[] chars) {

        int index = 0;   // write pointer: position where we write compressed result
        int i = 0;       // read pointer: used to traverse the input array

        // Traverse the character array
        while (i < chars.length) {

            char current = chars[i];  // current character
            int count = 0;            // count of consecutive occurrences

            // Count how many times current character repeats
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // Write the character to the array
            chars[index++] = current;

            // If character occurs more than once, write its count
            if (count > 1) {
                String cnt = String.valueOf(count);  // convert count to string

                // Write each digit of count separately
                for (char c : cnt.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        // index represents the new length of compressed array
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[] chars = new char[size];
        for (int i = 0; i < size; i++) {
            chars[i] = sc.next().charAt(0);
        }
        stringcompression obj = new stringcompression();

        int newLength = obj.compress(chars);

        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }

}

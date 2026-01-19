
public class reverseword {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }st

            if (i < 0) {
                break;
            }

            int j = i;

            // Find word start
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            // Append word
            sb.append(s.substring(j + 1, i + 1));
            sb.append(" ");

            i = j;
        }

        return sb.toString().trim();
    }
}

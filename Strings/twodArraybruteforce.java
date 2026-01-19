
import java.util.Scanner;

public class twodArraybruteforce {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();      // number of rows
        int n = sc.nextInt();      // number of columns
        int target = sc.nextInt();// element to search

        int[][] arr = new int[m][n];

        // Input the 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        // Brute-force search
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (arr[i][j] == target) {
                    System.out.println("Array found at position: (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }

            // Stop searching once found
            if (found) {
                break;
            }
        }

        // If target is not found
        if (!found) {
            System.out.println("Array not found");
        }
    }
}


import java.util.Scanner;

public class twodarraybestaproach {

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;        // number of rows
        int n = matrix[0].length;     // number of columns

        int left = 0;                 // start of binary search
        int right = m * n - 1;        // end of binary search

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int row = mid / n;        // row index in matrix
            int column = mid % n;     // column index in matrix

            int values = matrix[row][column];

            if (values == target) {
                return true;
            } else if (values < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[][] arr = new int[m][n];

        // Input the 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        twodarraybestaproach obj = new twodarraybestaproach();
        System.out.println(obj.searchMatrix(arr, target));
    }
}

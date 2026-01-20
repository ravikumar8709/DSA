
public class UniqueValues {

    // Function to print unique values
    public static void printUnique(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // count frequency of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {   // unique value
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 1, 5};
        printUnique(arr);
    }
}

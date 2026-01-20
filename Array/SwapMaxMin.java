
public class SwapMaxMin {

    // Function to swap max and min
    public static void swapMaxMin(int[] arr) {

        int maxIndex = 0;
        int minIndex = 0;

        // find index of max and min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // swap
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 7};

        swapMaxMin(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

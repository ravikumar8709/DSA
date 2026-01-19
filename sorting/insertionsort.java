
public class insertionsort {

    static void sort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;

        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 5, 2, 3};
        int n = arr.length;
        insertionsort obj = new insertionsort();
        obj.sort(arr, n);
        for (int ch : arr) {
            System.out.print(ch + " ");
        }
    }
}

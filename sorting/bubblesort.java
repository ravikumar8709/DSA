
import java.util.*;

public class bubblesort {

    static void sort(int arr[]) {
        int s = 0;
        int end = arr.length - 1;
        for (int i = s; i < end; i++) {
            boolean isSwap = false;
            for (int j = s; j < end - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }

            }
            if (!isSwap) {
                return;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        bubblesort obj = new bubblesort();
        sort(arr);
        for (int ch : arr) {
            System.out.print(ch + " ");
        }

    }
}

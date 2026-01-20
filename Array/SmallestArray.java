
import java.util.*;

public class SmallestArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 3, 2, 2, 3, 4};
        // System.out.println(arr.length);
        int index = 0;
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                // if (arr[i] > smallest) { //largest
                smallest = arr[i];
                index = i;

            }
        }
        System.out.println(smallest);
        System.out.println(index);

    }
}

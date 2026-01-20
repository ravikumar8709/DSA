
import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int endArray = size - 1;
        for (int i = start; i < endArray; i++) {
            int temp = arr[start];
            arr[start] = arr[endArray];
            arr[endArray] = temp;
            start++;
            endArray--;

        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

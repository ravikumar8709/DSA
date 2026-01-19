
import java.util.*;

public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            } else {
                count++;
            }

        }
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

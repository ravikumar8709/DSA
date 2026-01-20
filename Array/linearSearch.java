
import java.util.*;

public class linearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int index = -1;

        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;

            }
        }
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("The value not found");
        }

    }
}

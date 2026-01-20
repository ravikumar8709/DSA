
import java.util.*;

public class BinarySearch {

    public static int search(int nums[], int t) {
        int start = nums[0];
        int end = nums.length;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (t < mid) {
                end = mid - 1;
            } else if (t > mid) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        BinarySearch obj = new BinarySearch();
        System.out.println(obj.search(nums, t));

    }
}

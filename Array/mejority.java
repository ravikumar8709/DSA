
// import java.util.*;
// public class mejority {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             int count = 0;
//             // Count occurrences of nums[i]
//             for (int j = 0; j < n; j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//             }
//             // Check if it's majority
//             if (count > n / 2) {
//                 return nums[i];
//             }
//         }
//         return -1; // theoretically never for valid input
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int s = sc.nextInt();
//         int nums[] = new int[s];
//         for (int i = 0; i < s; i++) {
//             nums[i] = sc.nextInt();
//         }
//         mejority obj = new mejority();
//         System.out.println(obj.majorityElement(nums));
//     }
// }
// moors voting algorithm
import java.util.*;

public class mejority {

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int nums[] = new int[s];

        for (int i = 0; i < s; i++) {
            nums[i] = sc.nextInt();
        }

        mejority obj = new mejority();
        System.out.println(obj.majorityElement(nums));
    }
}

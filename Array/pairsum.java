
// brute force approach
// public class pairsum {
//     public static void main(String[] args) {
//         int arr[] = {2, 7, 11, 15};
//         int t = 26;
//         int index = arr[0];
//         int index2 = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == t) {
//                     index = i;
//                     index2 = j;
//                 }
//             }
//         }
//         System.out.println(index);
//         System.out.println(index2);
//     }
// }
// better approach 
public class pairsum {

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int t = 26;
        int index = -1;
        int index2 = -1;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int pairsum = arr[i] + arr[j];
            if (pairsum < t) {
                i++;
            } else if (pairsum > t) {
                j--;
            } else {
                index = i;
                index2 = j;
                break;
            }
        }
        System.out.println(index);
        System.out.println(index2);
    }
}

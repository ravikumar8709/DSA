
public class KadanasAlgorithmMaxsubArray {

    public static void main(String[] args) {
        int arr[] = {3, -4, 5, 4, -1, 7, -8};
        int cursum = 0;
        int maxsum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            cursum += arr[i];
            maxsum = Math.max(cursum, maxsum);
            if (cursum < 0) {
                cursum = 0;
            }
        }
        System.out.println(maxsum);
    }
}

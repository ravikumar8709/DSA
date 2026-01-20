
public class MAximumsubArraysum {

    public static void main(String[] args) {
        int arr[] = {3, -4, 5, 4, -1, 7, -8};
        int maxsum = 0;
        for (int st = 0; st < arr.length; st++) {
            int curSum = 0;
            for (int end = st; end < arr.length; end++) {
                curSum += arr[end];
                maxsum = Math.max(curSum, maxsum);

            }

        }
        System.out.println(maxsum);
    }
}

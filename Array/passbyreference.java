
public class passbyreference {

    public static void chenge(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * arr[i];

        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 2};
        chenge(arr);
        for (int ch : arr) {
            System.out.print(ch + " ");
        }

    }
}

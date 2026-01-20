
import java.util.*;

public class sumanproduct {

    public void sumproduct(int arr[]) {
        int sum = 0;
        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            pro *= arr[i];

        }
        System.out.println(sum);
        System.out.println(pro);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sumanproduct obj = new sumanproduct();

        obj.sumproduct(arr);

    }
}


public class mergesortmain {

    static void mergesort(int arr[], int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergesort(arr, left, mid);
        mergesort(arr, mid + 1, right);
        merge(arr, left, right, mid);

    }

    static void merge(int arr[], int left, int right, int mid) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 7, 2, 9, 1};
        mergesortmain obj = new mergesortmain();
        obj.mergesort(arr, 0, arr.length - 1);

        for (int ch : arr) {
            System.out.print(ch + " ");
        }

    }
}

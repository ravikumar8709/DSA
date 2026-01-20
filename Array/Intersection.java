
public class Intersection {

    // Function to print intersection
    public static void printIntersection(int[] a, int[] b) {

        System.out.println("Intersection:");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {   // common element
                    System.out.print(a[i] + " ");
                    b[j] = Integer.MIN_VALUE; // avoid duplicates
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 3};
        int arr2[] = {3, 4, 7, 8, 3};

        printIntersection(arr1, arr2);
    }
}

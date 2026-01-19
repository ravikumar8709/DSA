
import java.util.Scanner;

public class computexpowern {

    public double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        if (x == -1 && n % 2 == 0) {
            return 1;
        }
        if (x == -1 && n % 2 == 1) {
            return -1;
        }
        long N = n; // no need to convert into binary because computer already save it into binary it treated as binary
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1;

        while (N > 0) {
            if (N % 2 == 1) {
                result *= x;
            }
            x *= x;
            N >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        computexpowern obj = new computexpowern();
        System.out.println(obj.myPow(x, n));

    }
}


import java.util.Scanner;

public class countprime {

    public int countPrimes(int n) {

        // If n is 2 or less, there are no primes less than n
        if (n <= 2) {
            return 0;
        }

        // Boolean array to mark prime numbers
        boolean isprime[] = new boolean[n];

        // Step 1: Assume all numbers from 2 to n-1 are prime
        for (int i = 2; i < n; i++) {
            isprime[i] = true;
        }

        // Step 2: Sieve of Eratosthenes
        for (int i = 2; i < Math.sqrt(n); i++) {

            // If i is still marked prime
            if (isprime[i]) {

                // Mark all multiples of i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isprime[j] = false;
                }
            }
        }

        // Step 3: Count prime numbers
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isprime[i]) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countprime obj = new countprime();
        System.out.println(obj.countPrimes(n));
    }
}

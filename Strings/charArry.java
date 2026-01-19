
import java.util.Scanner;

public class charArry {

    public static void main(String[] args) {
        String string1[] = {"ravi", "mohan"};
        char char2[] = {'a', 'b', '\0'};
        // char char3[] = {'Hello'};

        int arr[] = {2, 3, 4};
        // System.out.println(arr);
        System.out.print(char2.length);
        // System.out.print(string1);
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char ch[] = new char[size];
        for (int i = 0; i < size; i++) {
            ch[i] = sc.next().charAt(0);
        }
        System.out.print(ch);
    }

}

import java.util.Scanner;

public class RecursionBasics {
    static void print(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        print(n - 1);
    }

    static void printAfterRecursion(int n) {
        if (n == 0) {
            return;
        }

        printAfterRecursion(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Before recursive call:");
        print(n);

        System.out.println("After recursive call:");
        printAfterRecursion(n);
    }
}

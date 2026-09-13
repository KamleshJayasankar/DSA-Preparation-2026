import java.util.*;

public class SubarrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = n * (n + 1) / 2;
        System.out.println("Number of subarrays: " + count);

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
            }
        }
    }
}

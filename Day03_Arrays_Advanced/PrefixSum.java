import java.util.*;

public class PrefixSum {
    public static int[] buildPrefixSum(int[] nums) {
        int[] prefix = new int[nums.length];

        if (nums.length == 0) {
            return prefix;
        }

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        return prefix;
    }

    public static int rangeSum(int[] prefix, int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] prefix = buildPrefixSum(nums);

        for (int value : prefix) {
            System.out.print(value + " ");
        }

        if (n > 0) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            System.out.println("\nRange sum: " + rangeSum(prefix, left, right));
        }
    }
}

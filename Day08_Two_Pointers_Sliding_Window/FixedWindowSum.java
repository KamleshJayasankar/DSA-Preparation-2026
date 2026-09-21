public class FixedWindowSum {
    static int maxWindowSum(int[] nums, int k) {
        int window = 0;
        for (int i = 0; i < k; i++) window += nums[i];
        int max = window;
        for (int right = k; right < nums.length; right++) {
            window += nums[right] - nums[right - k];
            max = Math.max(max, window);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,5,1,3,2};
        System.out.println(maxWindowSum(nums, 3));
    }
}

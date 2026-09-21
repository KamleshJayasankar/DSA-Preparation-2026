public class TwoPointerPairSum {
    static boolean hasPair(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) return true;
            if (sum < target) left++;
            else right--;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6};
        System.out.println(hasPair(nums, 6));
    }
}

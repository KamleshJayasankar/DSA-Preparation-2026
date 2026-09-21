public class RecursiveMaximum {
    static int max(int[] nums, int index) {
        if (index == nums.length - 1) return nums[index];
        return Math.max(nums[index], max(nums, index + 1));
    }

    public static void main(String[] args) {
        int[] nums = {4, 9, 2, 7, 5};
        System.out.println(max(nums, 0));
    }
}

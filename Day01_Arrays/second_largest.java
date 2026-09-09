public class second_largest {
    public static int[] findTwoLargest(int[] nums) {
        int max1 = nums[0];
        int max2 = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            if (current > max1) {
                max2 = max1;
                max1 = current;
            } else if (current > max2 && current < max1) {
                max2 = current;
            }
        }

        return new int[]{max1, max2};
    }

    public static void main(String[] args) {
        int[] nums = {8, 3, 12, 5, 10};
        int[] result = findTwoLargest(nums);
        System.out.println("Largest: " + result[0]);
        System.out.println("Second largest: " + result[1]);
    }
}

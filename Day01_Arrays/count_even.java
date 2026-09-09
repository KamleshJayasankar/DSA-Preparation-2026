public class count_even {
    public static int countEven(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20, 25};
        System.out.println(countEven(nums));
    }
}

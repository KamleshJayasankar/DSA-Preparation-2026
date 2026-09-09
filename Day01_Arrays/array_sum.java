public class array_sum {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("Sum: " + sum);
    }
}

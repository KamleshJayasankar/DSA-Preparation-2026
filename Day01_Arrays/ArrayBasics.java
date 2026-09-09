public class ArrayBasics {

    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20, 25};

        // Array traversal
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Array sum
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Sum: " + sum);

        // Find maximum
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Maximum: " + max);

        // Find minimum
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Minimum: " + min);

        // Count even elements
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
    }
}

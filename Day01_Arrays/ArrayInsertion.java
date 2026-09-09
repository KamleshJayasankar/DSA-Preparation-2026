public class ArrayInsertion {

    public static void main(String[] args) {
        int[] nums = new int[6];

        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 20;
        nums[4] = 25;

        int size = 5;
        int index = 2;
        int value = 12;

        // Shift elements from right to left to make space.
        for (int i = size - 1; i >= index; i--) {
            nums[i + 1] = nums[i];
        }

        nums[index] = value;
        size++;

        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

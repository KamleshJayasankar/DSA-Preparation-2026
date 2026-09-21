import java.util.*;

public class SubsetBacktracking {
    static void generate(int[] nums, int index, List<Integer> current) {
        if (index == nums.length) {
            System.out.println(current);
            return;
        }

        // CHOOSE: include the current element
        current.add(nums[index]);

        // EXPLORE
        generate(nums, index + 1, current);

        // UNDO
        current.remove(current.size() - 1);

        // EXPLORE the other choice: exclude the current element
        generate(nums, index + 1, current);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        generate(nums, 0, new ArrayList<>());
    }
}

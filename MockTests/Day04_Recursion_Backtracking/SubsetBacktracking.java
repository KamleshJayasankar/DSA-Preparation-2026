import java.util.*;

public class SubsetBacktracking {
    static void generate(int[] nums, int index, List<Integer> current) {
        if (index == nums.length) {
            System.out.println(current);
            return;
        }

        current.add(nums[index]);
        generate(nums, index + 1, current);
        current.remove(current.size() - 1);

        generate(nums, index + 1, current);
    }

    public static void main(String[] args) {
        generate(new int[]{1, 2, 3}, 0, new ArrayList<>());
    }
}

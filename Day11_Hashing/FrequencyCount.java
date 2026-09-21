import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 2};
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        System.out.println(frequency);
    }
}

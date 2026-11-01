import java.util.*;

public class LC90 {

    public static void subsets(int[] nums, int[] ans,
                               int i, int j,
                               List<List<Integer>> result) {

        // Base case
        if (i == nums.length) {
            List<Integer> list = new ArrayList<>();

            for (int k = 0; k < j; k++) {
                list.add(ans[k]);
            }

            result.add(list);
            return;
        }

        // Include
        ans[j] = nums[i];
        subsets(nums, ans, i + 1, j + 1, result);

        // Exclude and skip duplicates
        int next = i + 1;

        while (next < nums.length && nums[next] == nums[i]) {
            next++;
        }

        subsets(nums, ans, next, j, result);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2};

        Arrays.sort(nums);

        int[] ans = new int[nums.length];

        List<List<Integer>> result = new ArrayList<>();

        subsets(nums, ans, 0, 0, result);

        System.out.println(result);
    }
}
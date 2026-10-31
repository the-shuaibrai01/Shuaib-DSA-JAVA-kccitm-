public class L53MaxSum {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int ms = nums[0];  // initialize with first element

        for (int i = 1; i < n; i++) {
            if (sum > 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            if (sum > ms) {
                ms = sum;
            }
        }

        return ms;
    }

    public static void main(String[] args) {
        L53MaxSum sol = new L53MaxSum();  // fixed: was "Solution"
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = sol.maxSubArray(nums);
        System.out.println("Max Subarray Sum: " + result);
    }
}
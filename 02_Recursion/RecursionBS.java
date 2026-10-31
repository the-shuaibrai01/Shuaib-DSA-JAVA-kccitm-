public class RecursionBS {

    public static int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public static int binarySearch(int[] nums, int target, int st, int end) {

        if (st <= end) {

            int mid = st + (end - st) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, end);
            } else {
                return binarySearch(nums, target, st, mid - 1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;

        int result = search(nums, target);

        System.out.println("Target index: " + result);
    }
}

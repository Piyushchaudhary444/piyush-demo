public class tripletsumclosest {
    public static int findClosestSum(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(target - sum) < closest) {
                        closest = Math.abs(target - sum);
                        result = sum;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 17};
        int target = 10;
        System.out.println("Closest sum: " + findClosestSum(nums, target));
    }
}


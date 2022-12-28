public class LeetCode1913 {
    public int maxProductDifference(int[] nums) {
        int n = nums.length - 1;
        for (int i = 0; i < 2; i++) {
            int index = i;
            for (int j = i + 1; j <= n; j++) {
                if (nums[index] > nums[j]) {
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        for (int i = 2; i < 4; i++) {
            int index = i;
            for (int j = i + 1; j <= n; j++) {
                if (nums[index] < nums[j]) {
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        return nums[3]*nums[2]-nums[0]*nums[1];
    }
}
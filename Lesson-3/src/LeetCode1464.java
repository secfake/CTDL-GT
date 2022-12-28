import java.util.ArrayList;
import java.util.List;

public class LeetCode1464 {
    public int maxProduct(int[] nums) {
        int n = nums.length - 1;
        for (int i = 0; i < 2; i++) {
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
        return (nums[0] - 1) * (nums[1] - 1);
    }

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i * 2 + i] = nums[n + i];
        }
        return ans;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max =0;
        for (int i = 0; i < candies.length; i++) {
            if (max>candies[i]+extraCandies){
                list.add(false);
            }else {
                max=candies[i]+extraCandies;
                list.add(true)l
            }
        }
        return list;
    }
}

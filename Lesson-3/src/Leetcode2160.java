public class Leetcode2160 {
    public int minimumSum(int num) {
        int[] ans = new int[4];
        for (int i = 0; i < 4; i++) {
            ans[i] = num % 10;
            num /= 10;
            for (int j = 0; j < i; j++) {
                if (ans[j] > ans[i]) {
                    int temp = ans[j];
                    ans[j] = ans[i];
                    ans[i] = temp;
                }
            }
        }
        return (ans[0]+ans[1])*10+ans[2]+ans[3];

    }
}

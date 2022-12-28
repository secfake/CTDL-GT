public class LeetCode342 {
    public boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        if (n < 4)
            return false;
        if (n % 4 != 0) {
            return false;
        } else {
            return isPowerOfFour(n / 4);
        }
    }
}

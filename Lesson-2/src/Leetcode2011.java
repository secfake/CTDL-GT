public class Leetcode2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations) {
            if (s.equals("++X") || s.equals("X++")) {
                x += 1;
            } else {
                x -= 1;
            }
        }
        return x;
    }
}

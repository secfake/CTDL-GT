public class Leetcode1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int countL = 0;
        int countR = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='L'){
                countL++;
            }
            if (s.charAt(i)=='R'){
                countR++;
            }
            if (i > 0 && countL == countR) {
                count++;
            }
        }
        return count;
    }
}

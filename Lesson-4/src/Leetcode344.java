public class Leetcode344 {
    public void reverseString(char[] s) {
        hoanvi(s, 0, s.length - 1);
    }

    public void hoanvi(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        char c = s[start];
        s[start] = s[end];
        s[end] = c;
        hoanvi(s, start + 1, end - 1);
    }
}

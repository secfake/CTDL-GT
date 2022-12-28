public class LeetCode394 {
    public String decodeString(String s) {
        return decode(s, 0, "")
    }

    public String decode(String s, int i, String deco) {
        if (s.length() == i) {
            return "";
        }
        if (s.charAt(i) == ']')
            return "";
        if (s.charAt(i) > '0' && s.charAt(i) <= '9') {
            String temp = deco(s, i + 2)
            for (int j = 0; j < Integer.parseInt(s.charAt(i)) - 1; j++) {
                temp += temp;
            }
            return temp;
        }
        return s.charAt(i) + deco(s, i + 1);
    }
}

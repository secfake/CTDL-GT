public class Leetcode557 {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            str.append(reverseStr(arr[i]));
            str.append(" ");
        }
        str.append(reverseStr(arr[arr.length - 1]));
        return str.toString();
    }

    public String reverseStr(String s) {
        StringBuilder str = new StringBuilder(s);
        return str.reverse().toString();
    }
}

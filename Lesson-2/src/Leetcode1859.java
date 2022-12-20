import java.util.HashMap;
import java.util.Map;

public class Leetcode1859 {
    public String sortSentence(String s) {
        StringBuilder str = new StringBuilder();
        Map<Integer, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        for (String temp : arr) {
            int n = temp.length();
            map.put(Integer.parseInt(String.valueOf(temp.charAt(n - 1))), temp.substring(0, n - 1));
        }
        for (int i = 0; i < arr.length; i++) {
            str.append(map.get(i + 1));
            if (i != arr.length - 1) {
                str.append(" ");
            }
        }
        return str.toString();
    }
}

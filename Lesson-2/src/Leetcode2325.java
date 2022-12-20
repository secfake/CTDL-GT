import java.util.HashMap;
import java.util.Map;

public class Leetcode2325 {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        map.put(' ', ' ');
        char alpha = 'a';
        for (int i = 0; i < key.length(); i++) {
            if (!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),alpha++);
            }
        }
        StringBuilder decode = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            decode.append(map.get(message.charAt(i)));
        }
        return decode.toString();
    }
}

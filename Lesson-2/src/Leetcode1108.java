public class Leetcode1108 {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        char[] chars = address.toCharArray();
        for (char c : chars) {
            if (c=='.'){
                str.append("[.]");
            }else{
                str.append(c);
            }
        }
        return str.toString();
    }
}

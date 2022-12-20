public class Leecode771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] jewel = jewels.toCharArray();
        char[] stone = stones.toCharArray();
        for (char j : jewel) {
            for (char s : stone) {
                if (j == s) {
                    count++;
                }
            }
        }

        return count;
    }
}

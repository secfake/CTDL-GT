public class Leecode771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewel.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewel.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }
}

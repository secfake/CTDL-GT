public class LeetCode2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length - 1; i++) {
            int index = i;
            for (int j = i; j < heights.length - 1; j++) {
                if (heights[index] < heights[j + 1])
                    index = j+1;
            }
            int temp = heights[i];
            heights[i] = heights[index];
            heights[index] = temp;

            String s = names[i];
            names[i] = names[index];
            names[index] = s;
        }
        return names;
    }
}

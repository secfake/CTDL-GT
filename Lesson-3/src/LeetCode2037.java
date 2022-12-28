public class LeetCode2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        sort(seats);
        sort(students);
        int sum=0;
        for (int i = 0; i < seats.length; i++) {
            sum+=Math.abs(students[i]-seats[i]);
        }
        return sum;
    }

    public void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[index] > nums[j]) {
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
    }
}

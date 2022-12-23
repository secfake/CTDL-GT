import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {11, 6, 31, 47, 6, 0, -2, 98, 56, 25};
        for (int i = 0; i < arr.length; i++) {
            int insert = arr[i];
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > insert) {
                    arr[index] = arr[j];
                    insert--;
                }
            }
            arr[index] = insert;
        }
        System.out.println(Arrays.toString(arr));
    }
}

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {11, 22, 31, 47, 6, 0, -2, 98, 56, 25};
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

}

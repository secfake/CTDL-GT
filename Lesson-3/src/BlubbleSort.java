import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {11, 22, 31, 47, 6, 0, -2, 98, 56, 25};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}

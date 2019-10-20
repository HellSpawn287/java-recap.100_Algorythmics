import java.util.Arrays;

public class BubbleSort {

    static void bubleSort(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < (n - 1); i++) {
            System.out.println("\nSort Pass Number :" + (i + 1));
            for (int j = 1; j < (n - i); j++) {
                System.out.println("Comparing number " + String.valueOf(array[j - 1]) + " and " + String.valueOf(array[j]));
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\n\nFinished : " + Arrays.toString(array));
    }
}

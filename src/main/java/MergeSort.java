import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array) {
        int n = array.length;
        mergeSort(array, n);
    }

    private static void mergeSort(int[] array, int arrayLength){
        if (arrayLength < 2) {
            return;
        }
        int pivot = arrayLength / 2;//pivot is a midpoint of the array;
        int[] left = new int[pivot];
        int[] right = new int[arrayLength - pivot];

        for (int i = 0; i < pivot; i++) {
            left[i] = array[i];
        }
        for (int i = pivot; i < arrayLength; i++) {
            right[i - pivot] = array[i];
        }

        mergeSort(left, pivot);
        mergeSort(right, arrayLength - pivot);
        merge(array, left, right, pivot, arrayLength - pivot);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (leftArray[i] < rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[k++] = leftArray[i++];
        }
        while (j < right){
            array[k++] = rightArray[j++];
        }
        System.out.println("Array after mergeSort :" + Arrays.toString(array));
    }

}

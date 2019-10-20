public class SortingChallenges {

    public static void main(String[] args) {
        int[] array = {56, 45, 23, 5, 1, 3, 10, 30};
        System.out.println("\nBubbleSort: ");
        BubbleSort.bubleSort(array);
        System.out.println("\nMergeSort: ");
        MergeSort.mergeSort(array);
        System.out.println("\nQuickSort: ");
        QuickSort.quickSort(array);
    }
}

package Sorting;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{4, 57, 3, 2, 18, 62, 3, 22, 12, 13, 73};
        BubbleSort bubbleSort = new BubbleSort();

        System.out.println("Bubble sort:");
        bubbleSort.bubbleSort(array);

        System.out.println("Insert sort: ");
        int[] anotherArray = new int[]{5,85,17,26,24,46,38,4,9,15,26,48};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(anotherArray);
        }
}

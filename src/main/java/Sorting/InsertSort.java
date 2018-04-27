package Sorting;

public class InsertSort {

    public void insertSort(int[] array){
        for (int j = 1; j < array.length; j++){ //sorted array
            int key = array[j]; //element to be sorted
            int i = j-1; // number of unsorted array element
            while((i > -1) && (array[i] > key)){ //moving smaller element to the beginning
                array[i+1] = array[i];
                i = i-1;
            }
            array[i+1] = key;
        }
        System.out.println(array);
    }
}

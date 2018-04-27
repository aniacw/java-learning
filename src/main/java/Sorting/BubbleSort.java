package Sorting;

public class BubbleSort {
    int[] array;
        public void bubbleSort(int[] array){
            int temp;
            for(int i = 0; i < array.length-1; i++){
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
        }
            System.out.println(array);
    }
}

public class SelectionSort {

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            // Find the minimum element index in array 
            int index = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
                
            int temp = arr[index]; //swap the min index element with the ith position element
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,3,4,6,4,4,32,3,4,5,56,7,8,5,45,234,45,56,4643,243,4,3,43,45,42,34,6565};
        selectionSort(arr);
        for(int i : arr)
            System.out.print(i+" "); // O/P = 4
    }
}

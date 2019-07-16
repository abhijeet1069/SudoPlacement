public class InsertionSort {
    public static void insertSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,23,23,211,45,56,6,4,23,45,4,23,4,2,23,23,34,5,6};
        /* Or, int[] data;
              data = new int[]{10,22,34,5,2,3}; */

        insertSort(arr); // Arrays are passed by reference
        for(int i : arr)
            System.out.print(i+" ");
    }
}

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,23,23,211,45,56,6,4,23,45,4,23,4,2,23,23,34,5,6};

        bubbleSort(arr); // Arrays are passed by reference
        for(int i : arr)
            System.out.print(i+" ");
    }
}

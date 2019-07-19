public class BinarySearch {

    public static int binSrch(int[] arr, int left, int right, int key) {
        int mid = (left + right) / 2;
        if (left <= right){
            if (arr[mid] == key)
                return mid;
            else if(key > arr[mid])
                return binSrch(arr,mid+1,right,key);
            else
                return binSrch(arr,left,mid-1,key);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,12,18,19,32};
        System.out.println(binSrch(arr,0,arr.length-1, 7));
    }
}

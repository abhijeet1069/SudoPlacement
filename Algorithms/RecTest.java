public class RecTest {

    public static int recMax(int[] arr, int left, int right){
        int mid = (left+right)/2;
        if(left == right)
            return arr[left];
        return (Math.max(recMax(arr, left, mid),recMax(arr, mid+1, right)));
    }

    public static void main(String[] args) {
        int[] arr = {8,4,12,32,9,6,8,10,34,886,6655};
        System.out.println(recMax(arr,0,10));
    }
}

package Array;

import java.util.HashSet;
import java.util.Scanner;
class GfG
{
    void countDistinct(int A[], int k, int n)
    {
        for(int i = 0; i <= n-k; i++){
            HashSet<Integer> set = new HashSet<>(); //creating new set
            for(int j = 0; j < k; j++){
                set.add(A[i+j]); //adding elements from set
            }
            System.out.print(set.size()+" "); //elements count
        }
        System.out.println();
    }
}

public class DistinctWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            GfG g = new GfG();
            g.countDistinct(a,k,n);
            System.out.println();
            t--;
        }
    }
}

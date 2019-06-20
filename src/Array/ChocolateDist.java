package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class ChocolateDistLogic{
    public int func(int[] arr, int m) {
        Arrays.sort(arr); //sorting arrays in ascending order
        int res = Integer.MAX_VALUE; //Max Integer value
        for(int i = 0; i <= arr.length-m; i++)
            res = Math.min(res,arr[i+m-1]-arr[i]); //Min between two numbers
        return res;
    }
}

public class ChocolateDist {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        ChocolateDistLogic solve = new ChocolateDistLogic();
        for (int i = 0; i < test; i++) {
            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] str = line.trim().split("\\s+"); //regex=Regular Expression
            int[] arr = new int[n];
            for (int j = 0; j < n; j++)
                arr[j] = Integer.parseInt(str[j]);
            int m = Integer.parseInt(br.readLine());
            System.out.println(solve.func(arr,m));
        }
    }
}
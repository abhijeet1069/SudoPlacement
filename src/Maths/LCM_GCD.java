package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCM_GCD {

    public static int square(int x){
        return x*x;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        System.out.println(square(Integer.parseInt(str)));
    }
}

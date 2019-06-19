package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solver1{
    public String powerOf2(long a){
        double res = Math.log(a)/Math.log(2);
        res = (double)Math.round(res*100000d)/100000d; //546.56479874 -> 546.5648
        if(res - (long)res == 0)
            return "YES";
        else
            return "NO";
    }
}

public class PowerOf2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        Solver1 solve = new Solver1();
        for (int i = 0; i < test; i++){
            long a = Long.parseLong(br.readLine());
            System.out.println(solve.powerOf2(a));
        }
    }
}

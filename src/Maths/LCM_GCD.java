package Maths;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solver{
    public int GCD(int a, int b){
        if (b == 0) {
            return a;
        }
        return GCD(b , a % b);
    }
}

public class LCM_GCD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        Solver solve = new Solver();
        for (int i = 0; i < test; i++){
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);
            int gcd = solve.GCD(a,b);
            System.out.println((a*b)/gcd+ " "+gcd);
        }
    }
}

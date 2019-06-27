package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++){
            int n = Integer.parseInt(br.readLine());
            StringBuffer str1 = new StringBuffer(br.readLine().toLowerCase());
            if (str1.toString().equals(str1.reverse().toString())) //.equals() doesen't work on StringBuffer
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

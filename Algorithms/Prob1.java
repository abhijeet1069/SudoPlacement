import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Prob1 {
    HashMap<Integer,Integer> numCycle = new HashMap<>();

    public int countCycle(int n, int ctr){

        if(numCycle.containsKey(n)) //check if paricular key present
            return ctr;

        else{
            if(n==1) {
                numCycle.put(n, ctr); //new entry
                return ctr;
            }
            else if(n%2 == 0)
               return countCycle(n/2, ++ctr);
            else
               return countCycle(3*n+1, ++ctr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split("\\s+");
        Prob1 obj = new Prob1();
        int max = 0;
        for (int i = Integer.parseInt(input[0]); i <= Integer.parseInt(input[1]); i++) {
            int temp = obj.countCycle(i,1);
            if( temp > max)
                max = temp;
        }
        System.out.println(input[0]+" "+input[1]+" "+max);
    }
}

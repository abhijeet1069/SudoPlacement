import java.util.Arrays;

public class EratosthenesSieve {
 
static boolean[] sieve(int n) { //Limitation: Doesen't apply for long 

	boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] = false;
        for(int factor = 2; factor*factor <= n; factor++){
            if(arr[factor])
                for(int j = factor; factor*j <= n; j++)
                    arr[factor*j] = false;
        }
        return arr;
}
   
    public static void main(String[] args) {
        int n = 49;
        boolean[] arr = sieve(n);
	for(int i = 0; i < n ;i++)
            System.out.println(i+" "+arr[i]);
    }    
}

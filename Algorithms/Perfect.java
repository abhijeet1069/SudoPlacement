public class Perfect {
 
static boolean isPerfect(int n) {

	double sq = Math.sqrt(n);
        return ((sq - Math.floor(sq)) == 0.0);
}
   
    public static void main(String[] args) {
        int n = 49;
	System.out.println(isPerfect(n));
    }    
}

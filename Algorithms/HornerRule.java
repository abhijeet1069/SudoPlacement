public class HornerRule {

    public static int horner(int x, int[] coeff){
        int res = 0;
        for(int i = coeff.length-1; i >= 0; i--)
            res = coeff[i] + x*res;
        return res;
    }

    public static void main(String[] args) {
        /*(x+1)^3 = x^3 + 3*x^2 + 3*x + 1
           Here,  (4+1)^3 */
        int[] coeff = {1,3,3,1};
        System.out.print(horner(4,coeff)); //o/p = 125
    }
}

public class HornerRule {

    public static int horner(int x, int[] coeff){
        int res = coeff[0];
        for(int i = 1; i < coeff.length; i++)
            res = x*res + coeff[i];
        return res;
    }

    public static void main(String[] args) {
        /*(x+1)^3 = 1*x^3 + 3*x^2 + 3*x^1 + 1*x^0  Here,  (4+1)^3 */
        
        int[] coeff = {1,3,3,1}; //written in descending power
        System.out.print(horner(4,coeff)); //o/p = 125
    }
}

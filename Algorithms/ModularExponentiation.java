class ModularExponentiation{
    // (base^pow)%n
    public static int ModExp(int base, int pow, int n) {
        base = base % n;
        int res = 1;
        while(pow > 0){
            if((pow & 1) == 1) //Inner base compulsory
                res = (res * base) % n;
            pow = pow >> 1;
            base = (base*base)%n;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(ModExp(8,981, 384));
    }
} 

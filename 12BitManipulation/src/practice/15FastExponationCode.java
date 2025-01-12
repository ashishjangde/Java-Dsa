package practice;

class FastExponationCode {
    public static int fastExponentiation(int base, int exponent) {
       int ans = 1;
       while (exponent > 0) {
        if((exponent & 1) != 0) {
            ans = ans * base;
        }
        base = base * base;
        exponent = exponent >> 1;
       }
        return ans;
    }
    public static void main(String[] args) {
      
        
        int base = 2;
        int exponent = 10;
        
        System.out.println(fastExponentiation(base, exponent)); // 1024
    }
}

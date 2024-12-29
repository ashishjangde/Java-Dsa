 class NumberIsPrimeOrNot {

    public static boolean isPrime ( int n){
        if (n <= 1) {
            return false;
        }
        if(n == 2 ){
            return true;
        }
        for (int i = 2; i * i <= n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Is 5 prime? " + isPrime(5));
    }
}



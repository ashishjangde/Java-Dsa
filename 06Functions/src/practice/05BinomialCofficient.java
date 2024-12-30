package practice;

class BinomialCofficient {

    public static int factorial (int n ){
        if(n == 0){
            return 1;
        }
        int factorial = 1;
        for(int i = 1 ; i <= n ; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int binomialCofficient(int n, int r){
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    public static void main(String[] args) {
        System.out.println("binomial cofficient of 5 and 2 " +binomialCofficient(5, 2));
    }
}


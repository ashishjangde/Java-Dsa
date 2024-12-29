class FindFactorial {

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
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}



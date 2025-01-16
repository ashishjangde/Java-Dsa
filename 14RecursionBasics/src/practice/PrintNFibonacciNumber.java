package practice;

public class PrintNFibonacciNumber {

    private static int fibonacci(int n) {
        if (n == 1 | n == 0) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    private static void printFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printFibonacci(10);
    }
}

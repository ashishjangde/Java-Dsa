class PrimeNumberInRange {

    public static void primeInRange(int n) {
        for (int num = 2; num <= n; num++) { // Check every number from 2 to n
            boolean isPrime = true;         // Assume current number is prime
            for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisors up to sqrt(num)
                if (num % i == 0) {         // If divisible, not a prime
                    isPrime = false;
                    break;                 // Exit the loop early for efficiency
                }
            }
            if (isPrime) {                 // If prime, print the number
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Newline after output
    }

    
    public static void main(String[] args) {
        primeInRange(20); // Find and print primes up to 20
    }
}

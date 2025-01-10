package practice;
 class BinaryOperatorOr {
    public static void main(String[] args) {
        // Performing bitwise OR operation between 5 and 6
        // In bitwise OR, if any of the bits is 1, result is 1
        System.out.println("Bitwise OR: " + (5 | 6)); // 7
        
        /* 
         * Bitwise OR operation explained:
         * 
         * First number:  5 = 0101 (in binary)
         * Second number: 6 = 0110 (in binary)
         * --------------------------------
         * Result (5 | 6) = 0111 (in binary) = 7 (in decimal)
         * 
         * How it works:
         * 0101 (5)
         * 0110 (6)
         * ----
         * 0111 (7) <- Result after OR operation on each bit
         */
    }
}

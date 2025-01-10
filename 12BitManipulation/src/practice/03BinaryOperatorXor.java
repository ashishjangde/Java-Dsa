package practice;
 class BinaryOperatorXor {
    public static void main(String[] args) {
        // Performing bitwise XOR operation between 5 and 6
        // In bitwise XOR, if both bits are different, result is 1
        System.out.println("Bitwise XOR: " + (5 ^ 6)); // 3
        
        /* 
         * Bitwise XOR operation explained:
         * 
         * First number:  5 = 0101 (in binary)
         * Second number: 6 = 0110 (in binary)
         * --------------------------------
         * Result (5 ^ 6) = 0011 (in binary) = 3 (in decimal)
         * 
         * How it works:
         * 0101 (5)
         * 0110 (6)
         * ----
         * 0011 (3) <- Result after XOR operation on each bit
         */
    }
}

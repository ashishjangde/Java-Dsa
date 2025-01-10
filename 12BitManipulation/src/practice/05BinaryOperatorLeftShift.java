package practice;

 class BinaryOperatorLeftShift {
    public static void main(String[] args) {
        // Performing bitwise left shift operation on 8
        // In bitwise left shift, we shift all bits to the left by 1 position
        System.out.println("Bitwise left shift: " + (8 << 1)); // 16
        
        /* 
         * Bitwise left shift operation explained:
         * 
         * Number: 8 = 1000 (in binary)
         * --------------------------------
         * Result (8 << 1) = 10000 (in binary) = 16 (in decimal)
         * 
         * How it works:
         * 1000 (8)
         * ----
         * 10000 (16) <- Result after left shift by 1 position
         */ 
    }
}

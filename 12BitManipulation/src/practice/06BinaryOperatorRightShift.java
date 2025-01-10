package practice;

class BinaryOperatorRightShift {
    public static void main(String[] args) {
        // Performing bitwise right shift operation on 8
        // In bitwise right shift, we shift all bits to the right by 1 position
        System.out.println("Bitwise right shift: " + (8 >> 1)); // 4
        
        /* 
         * Bitwise right shift operation explained:
         * 
         * Number: 8 = 1000 (in binary)
         * --------------------------------
         * Result (8 >> 1) = 0100 (in binary) = 4 (in decimal)
         * 
         * How it works:
         * 1000 (8)
         * ----
         * 0100 (4) <- Result after right shift by 1 position
         */
    }
}

package practice;

class BinaryOperatorFirstComplement {
    public static void main(String[] args) {
        /*
         * MSB (Most Significant Bit):
         * - It's the leftmost bit in a binary number
         * - In signed numbers, MSB represents the sign (0 for positive, 1 for negative)
         * - Has the highest value in the number's position weight
         * 
         * LSB (Least Significant Bit):
         * - It's the rightmost bit in a binary number
         * - Has the lowest value in the number's position weight
         * - Determines if number is odd (1) or even (0)
         * 
         * 1's Complement:
         * - Created by inverting all bits (0→1, 1→0)
         * - Example: 5 in binary is 00000101
         * - 1's complement of 5 is 11111010
         * - Used in bitwise NOT operations
         */

        // Performing bitwise NOT operation on 5
        // In bitwise NOT, 1 becomes 0 and 0 becomes 1
        System.out.println("Bitwise NOT: " + (~5)); // -6
        
        /* 
         * Bitwise NOT operation explained:
         * 
         * Number: 5 = 0101 (in binary)
         * ---------------------------
         * Result (~5) = 1010 (in binary) = -6 (in decimal)
         * 
         * How it works:
         * 0101 (5)
         * ----
         * 1010 (-6) <- Result after NOT operation on each bit
         */
    }    
}

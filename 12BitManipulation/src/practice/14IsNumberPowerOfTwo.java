package practice;

 class IsNumberPowerOfTwo {
 public static void main(String[] args) {
        /*
         * A number is a power of two if it has only one bit set to 1.
         * For example, 4 is a power of two because it's binary representation is 100.
         * 4 - 00000100
         * 3 - 00000011
         * 4 & 3 = 0
         * 
         * 5 - 00000101
         * 4 - 00000100
         * 5 & 4 = 4
         */
        
        int number = 16; // 10000 in binary
        System.out.println(isPowerOfTwo(number)); // true
        
        number = 15; // 01111 in binary
        System.out.println(isPowerOfTwo(number)); // false
    }
    
    public static boolean isPowerOfTwo(int number) {
        // A number is a power of two if it has only one bit set to 1.
        // For example, 4 is a power of two because it's binary representation is 100.
        // 4 - 00000100
        // 3 - 00000011
        // 4 & 3 = 0
        
        // Check if the number is greater than 0 and has only one bit set to 1.
        return number > 0 && (number & (number - 1)) == 0;
 }
    
}
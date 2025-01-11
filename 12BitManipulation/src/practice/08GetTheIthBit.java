package practice;


class GetTheIthBit {
    /**
     * This method finds out whether the ith bit of a number is 0 or 1
     * 
     * How it works:
     * 1. Let's say number = 6 (binary: 110) and i = 2
     * 2. bitMask = 1 << i creates a number with only ith bit as 1
     *    (1 << 2 = 100 in binary)
     * 3. When we AND (&) the number with bitMask:
     *    - If result is 0, the ith bit was 0
     *    - If result is non-zero, the ith bit was 1
     * 
     * Example:
     * number = 6 (110 in binary)
     * i = 2
     * bitMask = 100
     * 110 & 100 = 100 (non-zero, so 2nd bit is 1)
     * 
     * @param number the number to check
     * @param i the position of the bit to check (0-based indexing)
     */
    public static void getTheIthBitfromANumber(int number, int i) {
        int bitMask = 1 << i;
        if((number & bitMask) == 0) {
            System.out.println("The " + i + "th bit is 0");
        } else {
            System.out.println("The " + i + "th bit is 1");
        }
    }

    /**
     * Main method to test the bit checking functionality
     * In this example, we check the 2nd bit of number 6
     */
    public static void main(String[] args) {
        getTheIthBitfromANumber(6, 2);
    }
}

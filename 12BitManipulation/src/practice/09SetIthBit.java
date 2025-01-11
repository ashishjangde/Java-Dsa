package practice;

 class SetIthBit {
    /*
     * To set the ith bit means to make it 1.
     * Example: Let's set 2nd bit of number 10 (1010)
     * Step 1: Take 1 and shift left by i positions (1 << 2)
     *         1 -> 0001
     *         After shift: 0100
     * Step 2: OR operation with original number
     *         1010 (original number)
     *       | 0100 (shifted 1)
     *         ----
     *         1110 (result = 14)
     */
    public static int setIthBit(int number, int position){
        // Left shift 1, then perform OR operation
        // to set the ith bit
        int bitMask = 1 << position;
        return (number | bitMask);
    }
    public static void main(String[] args) {
        System.out.println("Setting 2nd bit of 10: " + setIthBit(10, 2)); // 14
    }
}

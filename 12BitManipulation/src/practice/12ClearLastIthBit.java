package practice;

class ClearLastIthBit {
    public static int clearLastIthBit(int number, int position) {
        // Create a bitmask where the bit at the given position is 0 and all others are 1.
        // For example, if position = 2, then bitMask = ~(1 << 2) = ~(00000100) = 11111011.
        int bitMask = (~0) << position;

        // Perform an AND operation between the number and the bitmask.
        // This operation sets the bit at 'position' to 0 while keeping other bits unchanged.
        return (number & bitMask); // Clear the bit at the specified position (set it to 0).
    }
    public static void main(String[] args) {
        int number = 10; // 1010 in binary
        System.out.println(clearLastIthBit(number, 2)); // output: 8
    }
}

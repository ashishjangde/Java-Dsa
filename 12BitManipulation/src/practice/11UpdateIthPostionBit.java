package practice;

class UpdateIthPostionBit {


    public static int clearIthBit(int number, int position) {
        // Create a bitmask where the bit at the given position is 0 and all others are 1.
        // For example, if position = 2, then bitMask = ~(1 << 2) = ~(00000100) = 11111011.
        int bitMask = ~(1 << position);
        
        // Perform an AND operation between the number and the bitmask.
        // This operation sets the bit at 'position' to 0 while keeping other bits unchanged.
        return (number & bitMask); // Clear the bit at the specified position (set it to 0).
    }


    public static int setIthBit(int number, int position) {
        // Create a bitmask where the bit at the given position is 1 and all others are 0.
        // For example, if position = 2, then bitMask = (1 << 2) = 00000100.
        int bitMask = 1 << position;

        // Perform an OR operation between the number and the bitmask.
        // This operation sets the bit at 'position' to 1 without changing other bits.
        return (number | bitMask);
    }


    public static int updateIthBit(int number, int position, int bitValue) {
        // The commented-out code below shows an alternate way to implement this function:
        // if(value == 0){
        //     return clearIthBit(number, position); // Clears the bit if value is 0.
        // } else {
        //     return setIthBit(number, position);   // Sets the bit if value is 1.
        // }

        // Explanation of commented-out code:
        // The code first checks the value. If it's 0, it clears the bit using the clearIthBit function.
        // If it's 1, it sets the bit using the setIthBit function.

        // Check if the value is valid (must be either 0 or 1). If not, throw an error.
        if (bitValue != 0 && bitValue != 1) {
            throw new IllegalArgumentException("Value can be either 0 or 1");
        }

        // Step 1: Clear the bit at the specified position (set it to 0).
        int n = clearIthBit(number, position);

        // Step 2: Create a bitmask for the new value at the specified position.
        // If value is 1, bitMap = (1 << position); if value is 0, bitMap = (0 << position).
        int bitMap = bitValue << position;

        // Step 3: Perform an OR operation to set the bit to the new value.
        return (n | bitMap);
    }

    public static void main(String[] args) {
       
        int number = 10; // 1010 in binary
        System.out.println( updateIthBit(number, 2, 1));
    }
}

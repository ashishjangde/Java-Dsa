package practice;

 class ClearTheIthBit {
    
    public static int clearIthBit(int number, int position){
       /*
        * This method clears (sets to 0) the bit at the given position in the number
        * 
        * How it works:
        * 1. Create a bitmask using (1 << position)
        *    - This shifts 1 to the left by 'position' times
        *    - Ex: for position 1: 1 << 1 = 0010
        * 
        * 2. Use NOT (~) operator on the bitmask
        *    - This inverts all bits
        *    - Ex: ~(0010) = 1101
        * 
        * 3. Use AND (&) with original number
        *    - This keeps all bits same except makes position bit 0
        *    - Ex: 1010 & 1101 = 1000 (10 & 13 = 8)
        */
        int bitMask = ~(1 << position); 
        return (number & bitMask);
    }

    public static void main(String[] args) {
        System.out.println("Clearing 1st bit of 10: " + clearIthBit(10, 1)); // 8
    }
}

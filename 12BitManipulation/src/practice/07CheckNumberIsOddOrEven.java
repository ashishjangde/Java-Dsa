package practice;

 class CheckNumberIsOddOrEven {

    /**
     * Checks if a number is odd or even using bit manipulation
     * Logic: 
     * - When we perform AND operation of any number with 1:
     * - If last bit is 1 (odd number), result will be 1
     * - If last bit is 0 (even number), result will be 0 
     * 
     * Example:
     * 5 (odd)  -> 101 & 001 = 001 (1 in decimal)
     * 4 (even) -> 100 & 001 = 000 (0 in decimal)
     * 
     * @param number The number to check
     */
    public static void checkNumberIsOddOrEven(int number){
        int bitMask = 1;
        if((number & bitMask) == 1){
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }
    public static void main(String[] args) {
        checkNumberIsOddOrEven(4); // Number is even
    }
}

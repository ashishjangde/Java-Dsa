package practice;

 class ClearRangeOfTheIthBits {
    
    public static int clearRangeOfTheIthBits(int number, int position, int range) {
         int a = ((~0)<<(range+1));
        int b = (1<<position)-1;
        int bitmask = a|b;
        return number & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeOfTheIthBits(31, 1, 3)); // output: 17
    }
}

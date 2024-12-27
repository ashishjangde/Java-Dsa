package practice;

 class PrintReverseOfNumber {

    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0;
        for(int i = number; i != 0; i /= 10) {
            int digit = i % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("Reverse of " + number + " is " + reverse);
    }
}

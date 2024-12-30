package practice;

 class BinaryToDecimal {

    public static int binaryToDecimal(int a){
        int pow = 0;
        int decimal = 0;
        while(a != 0){
            int rem = a % 10;
            decimal += rem * Math.pow(2, pow);
            a /= 10;
            pow++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(101));
    }
    
}
package practice;

class DecimalToBinary {

    public static int decimalToBinary(int a){
        int binary = 0;
        int pow = 1;
        while(a != 0){
            int rem = a % 2;
            binary += rem * pow;
            a /= 2;
            pow *= 10;
        }
        return binary;
    }
      public static void main(String[] args) {
        System.out.println(decimalToBinary(5));
      }  
}

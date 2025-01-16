package practice;

public class SunOfNNaturalNumber {

    public  static  int sumOfNNaturalNumbers(int n) {
        if(n == 0 || n == 1 ){
            return 1;
        }
            return  n + sumOfNNaturalNumbers(n-1);

    }
    public static void main(String[] args) {
        System.out.println(sumOfNNaturalNumbers(5));
    }
}

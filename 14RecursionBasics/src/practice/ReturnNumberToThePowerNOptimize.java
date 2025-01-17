package practice;

public class ReturnNumberToThePowerNOptimize {

    public static double returnNumberToThePowerNOptimize(int number , int power) {
        if (power == 1) {
            return number;
        }
        double result = returnNumberToThePowerNOptimize(number , power/2);
        if(power % 2 != 0) {
            return  number * result * result;
        }
        return result * result;
    }

    public static void main(String[] args) {
        int number = 70;
        int power = 10;
        System.out.println("Result: " + returnNumberToThePowerNOptimize(number, power));
    }
}

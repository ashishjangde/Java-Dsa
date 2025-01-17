package practice;

public class ReturnNumberToThePowerN {

    public double returnNumberToThePowerN(int number , int power) {
        if (power == 1) {
            return number;
        }
        return number *  returnNumberToThePowerN(number , power - 1);
    }
    public static void main(String[] args) {
        System.out.println(new ReturnNumberToThePowerN().returnNumberToThePowerN(5, 2));
    }
}

package practice;

public class PrintNumberInIncreasingForm {

    public static void PrintNumberIncreasingForm(int number) {
        if (number > 0) {
            PrintNumberIncreasingForm(number - 1);
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        PrintNumberIncreasingForm(10);
    }
}

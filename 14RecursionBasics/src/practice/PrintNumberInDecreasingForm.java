package practice;

public class PrintNumberInDecreasingForm {

    public  static  void  PrintNumberDecreasingForm( int number) {
        if (number <= 0) {
            return;
        }
        System.out.print(number + " ");
        PrintNumberDecreasingForm(number - 1);

    }

    public static void main(String[] args) {
        PrintNumberDecreasingForm(10);
    }

}

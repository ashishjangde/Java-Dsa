package practice;

import java.util.Scanner;

class PrintSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0 ; i <= n; i++){
            for(int j =1 ; j<= n ; j ++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
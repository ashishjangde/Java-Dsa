package practice;

import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;  // 22/7 || 3.24 * r2
        System.out.println("The area of the circle is " + area);
    }
}

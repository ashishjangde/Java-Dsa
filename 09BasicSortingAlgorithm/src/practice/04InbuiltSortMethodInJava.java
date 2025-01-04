package practice;

import java.util.Arrays;


class InbuiltSortMethodInJava {
    public static void main(String[] args) {
        int [] arr = {10, 5, 30, 15, 50, 6};
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}

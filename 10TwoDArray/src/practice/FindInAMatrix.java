package practice;

public class FindInAMatrix {
    public static void stairCaseSearchInMatrix(int[][] arr, int key) {
        int row = 0, col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Found key at (" + row + ", " + col + ")");
                return;
            } else if (key > arr[row][col]) {
                row++; // Move to the next row
            } else {
                col--; // Move to the previous column
            }
        }

        // Key not found after the loop
        System.out.println("Key not found");
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int key = 7;
        stairCaseSearchInMatrix(arr, key);
    }
}


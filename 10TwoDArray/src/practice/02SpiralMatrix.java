package practice;

class SpiralMatrix {
    public static void printSpiral(int[][] arr) {
        int top = 0, bottom = arr.length - 1;
        int left = 0, right = arr[0].length - 1;

        while (left <= right && top <= bottom) {
            // Right
            for (int j = left; j <= right; j++){
                System.out.print(arr[top][j] + " ");
            }
            // Down
            for (int i = top + 1; i <= bottom; i++){
                System.out.print(arr[i][right] + " ");
            }

            // Left
            if (top < bottom){
                for (int j = right - 1; j >= left; j--){
                    System.out.print(arr[bottom][j] + " ");
                }
            }
            // Up
            if (left < right){
                for (int i = bottom - 1; i > top; i--){
                    System.out.print(arr[i][left] + " ");
                }
            }
            left++; right--; top++; bottom--;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        printSpiral(arr);
    }
}
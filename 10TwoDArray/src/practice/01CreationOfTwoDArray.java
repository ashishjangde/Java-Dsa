package practice;

class CreationOfTwoDArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8},
                {}
        };

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length == 0) {
                System.out.println("-"); // Represent empty row
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(); // New line after each row
            }
        }
    }
}

package practice;

class DiagonalSum {
    public static void printDiagonalSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int minDim = Math.min(rows, cols);

        int primary = 0, secondary = 0;

        for(int i = 0; i < minDim; i++) {
            primary += arr[i][i];
            secondary += arr[i][minDim-1-i];
        }

        if(minDim % 2 == 1) {
            secondary -= arr[minDim/2][minDim/2];
        }

        System.out.println("Primary diagonal: " + primary);
        System.out.println("Secondary diagonal: " + secondary);
        System.out.println("Total: " + (primary + secondary));
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {5,6,7},
                {9,10,11},
                {13,14,15}
        };
        printDiagonalSum(arr);
    }
}
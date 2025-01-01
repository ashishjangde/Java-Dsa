package practice;

class PrintSubArrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        printSubArrays(arr);
    }

    public static void printSubArrays(int[] arr) {
        // Outer loop to fix the starting point
        for (int i = 0; i < arr.length ; i ++){
            //inner loop to fix the ending point
            for (int j = i + 1 ; j < arr.length + 1 ; j ++){
                System.out.print("(");
                // loop to print the subarray from i to j
                for (int k = i  ; k < j  ; k++){
                    System.out.print(arr[k] + "");
                    if (k < j - 1){
                        System.out.print(", ");
                    }
                }
                System.out.print(") ");
            }
            System.out.println();
        }
    }
}

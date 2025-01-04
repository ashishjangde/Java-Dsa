package practice;

 class BubbleSortCode {

    public static int[] bubbleSortAnArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0; // Tracks if any swaps are made in the current pass
            for (int j = 0; j < arr.length - 1 - i; j++) { // -i because the last i elements are already sorted
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            System.out.println("Swap: " + swap);
            if (swap == 0) { // If no swaps are made, array is already sorted
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Already sorted array
        int[] array = bubbleSortAnArray(arr);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}

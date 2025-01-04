package practice;
class InsertionSort {
    public static  int [] insertionSort(int [] arr ) {
        for( int i = 0 ; i < arr.length - 1 ; i ++){
            int current = i ;
            int previous = i - 1;
            while(previous >= 0 && arr[previous] > arr[current]){
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = arr[current];
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {10, 5, 30, 15, 50, 6};
        int [] sortedArray = insertionSort(arr);
        for (int j : sortedArray) {
            System.out.print(j + " ");
        }
    }
}


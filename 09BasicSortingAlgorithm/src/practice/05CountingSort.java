package practice;

class CountingSort {
    public static void main(String[] args) {
        int[] arr = {23, 23, 55, 90 , 1 , 3 , 67 , 89};
        int [] sortedArray = countingSortAnArray(arr);

        for(int j : sortedArray){
            System.out.print(j + " ");
        }
    }

    public static int[] countingSortAnArray(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int value : arr) {
            largest = Math.max(largest, value);
        }

        int[] count = new int[largest + 1];

        for (int k : arr) {
            count[k]++;
        }
        //sorting
        int j = 0;
        for (int i = 0 ; i < count.length ; i ++){
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        return arr;
    }
}

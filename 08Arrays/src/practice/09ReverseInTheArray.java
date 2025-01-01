package practice;

class ReverseInTheArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        ReverseArray(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void ReverseArray(int[] arr){
        int start = 0;
        int end = arr.length -1 ;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

package practice;

class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50 , 66 , 77 , 88 , 99};
        int element = 66;
        int index = BinarySearchInArray(arr, element);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }else{
            System.out.println("Element not found in the array");

        }
    }

   public static  int BinarySearchInArray(int[] arr , int element){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == element){
                return mid;
            }else if(arr[mid] < element){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}

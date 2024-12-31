package practice;

 class LinearSearchInArray {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int element = 30;
        int index = linearSearchInArray(arr, element);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }else{
            System.out.println("Element not found in the array");
        }
    }

    // Method to search for an element in the array
    public static int linearSearchInArray(int[] arr , int element){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}

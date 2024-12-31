package practice;
class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int largest = largestInArray(arr);
        System.out.println("The largest element in the array is: " + largest);
    }

    // Method to find the largest element in the array
    public static int largestInArray(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}

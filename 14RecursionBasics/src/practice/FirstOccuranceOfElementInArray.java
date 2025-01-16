package practice;

public class FirstOccuranceOfElementInArray {

    public static int returnFirstOccuranceOfElementInArray(int[] arr, int element , int  index) {
        if(index == arr.length){
            return -1;
        }
        if (arr[index] == element) {
            return index;
        }
        return returnFirstOccuranceOfElementInArray(arr, element , index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(returnFirstOccuranceOfElementInArray(arr , 9 , 0));
    }
}

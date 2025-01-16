package practice;

public class LastOccuranceOfElementInArray {

    public static int printLastOccurance(int[] arr, int element, int lastIndex) {
        if (lastIndex < 0) {
            return -1;
        }

        if (arr[lastIndex] == element) {
            return lastIndex;
        }


        return printLastOccurance(arr, element, lastIndex - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5};
        int element = 2;
        int lastIndex = printLastOccurance(arr, element, arr.length - 1);

        if (lastIndex != -1) {
            System.out.println("The last occurrence of element " + element + " is at index: " + lastIndex);
        } else {
            System.out.println("Element " + element + " not found in the array.");
        }
    }
}

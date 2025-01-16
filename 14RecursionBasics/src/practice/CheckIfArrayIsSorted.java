package practice;

public class CheckIfArrayIsSorted {

    public static boolean checkIfArrayIsSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return checkIfArrayIsSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 , 2};

        if (checkIfArrayIsSorted(arr, 0)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}

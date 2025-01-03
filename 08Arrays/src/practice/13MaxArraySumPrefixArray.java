package practice;

class MaxArraySumPrefixArray {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        maxSumPrefixArray(arr);
    }

    public static void maxSumPrefixArray(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            prefixSum[i] = prefixSum[i -1] + arr[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = prefixSum[j] - prefixSum[i] + arr[i];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("The maximum sum is: " + maxSum);
    }
}

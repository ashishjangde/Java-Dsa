package practice;

class MaxSubArraySumKadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        maxSubArraySumKadaneAlgorithm(arr);
    }
    public static void maxSubArraySumKadaneAlgorithm(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int j : arr) {
            sum += j;
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("The maximum sum is: " + maxSum);
    }
}

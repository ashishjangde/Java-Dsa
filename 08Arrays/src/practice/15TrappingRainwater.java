package practice;

class TrappingRainwater {
    public static void main(String[] args) {
        int [] height = {4,2,0,6,3,2,5};
        int width = 1;
        System.out.println(trappingRainWaterInTheArray(height , width));
    }

    public static int trappingRainWaterInTheArray(int[] height , int width){
         int n = height.length;
            //calculate the left max boundary
            int[] leftMax = new int[n];
            leftMax[0] = height[0];
            for (int i = 1; i < n; i++) {
                leftMax[i] = Math.max(leftMax[i - 1], height[i]);
            }
           //calculate the right max boundary
            int [] rightMax = new int[n];
            rightMax[n - 1] = height[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(rightMax[i + 1], height[i]);
            }
           //loop
            int trappedWater = 0;
            for (int i = 0; i < n; i++) {
                //calculate the trapped water  waterLevel = (leftMax , rightMax) - height[i]
                trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
            }
            //finally return the trapped water
            return trappedWater * width;


    }
}

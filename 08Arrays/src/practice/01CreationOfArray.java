package practice;

 class CreationOfArray {

    public static void main(String[] args) {
        // 1. Declaration of an array
        int[] arr1;
        // 2. Instantiation of an array
        arr1 = new int[5];
        // 3. Initialization of an array
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        // 4. Declaration, Instantiation and Initialization of an array
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println(arr2[0]);

        // 5. Declaration, Instantiation and Initialization of an array
        int[] arr3 = new int[]{10, 20, 30, 40, 50};
            System.out.println(arr3[0]);
        // 6. Declaration, Instantiation and Initialization of an array
        int[] arr4 = new int[5];
        arr4[0] = 10;
        arr4[1] = 20;
        arr4[2] = 30;
        arr4[3] = 40;
        arr4[4] = 50;

        // 7. Declaration, Instantiation and Initialization of an array
        int[] arr5 = new int[5];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = (i + 1) * 10;
        }
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " ");
        }

    }
}
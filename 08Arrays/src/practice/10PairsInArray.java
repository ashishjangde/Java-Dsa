package practice;

class PairsInArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50 , 66 , 77 , 88 , 99};
        createPairsOfAnArray(arr);
    }

    public static  void createPairsOfAnArray(int[] arr){
        for (int i = 0  ; i < arr.length ; i++){
            for (int j = i + 1 ; j < arr.length ; j++){
                System.out.print( "(" + arr[i] + " , "  + arr[j] + ") ");
            }
            System.out.println();
        }
    }
}

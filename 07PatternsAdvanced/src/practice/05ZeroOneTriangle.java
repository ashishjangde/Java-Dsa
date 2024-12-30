package practice;
    
 class ZeroOneTriangle {
    
    public static void printZeroOneTriangle(int n ){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printZeroOneTriangle(5);   
    }
}

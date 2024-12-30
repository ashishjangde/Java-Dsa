package practice;
 class HollowRectanglePattern {

    public static void main(String[] args) {
        System.out.println("Hollow Rectangle Pattern");
        printHollowPattern(5, 5);
    }

    public static void printHollowPattern(int row , int col ){
        for(int i = 1 ; i <= row ; i ++){
            for(int j = 1; j <= col ; j++){
                if(i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
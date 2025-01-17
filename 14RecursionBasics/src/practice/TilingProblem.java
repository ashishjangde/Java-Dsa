package practice;

public class TilingProblem {
    /*
        Given a "2 X N" board and tiles of size "2 x 1" count the number of ways
        to tile the given board using the 2 X 1 tiles.
        (A tile can either be placed horizontally or vertically )
   */
    public static int returnTotalNumberOfWays(int n) {
        // Base cases
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        }


        int verticalTile = returnTotalNumberOfWays(n - 1);
        int horizontalTiles = returnTotalNumberOfWays(n - 2);


        return verticalTile + horizontalTiles;
    }

    public static void main(String[] args) {
        System.out.println("n=2: " + returnTotalNumberOfWays(2));  // Should be 2
        System.out.println("n=3: " + returnTotalNumberOfWays(3));  // Should be 3
        System.out.println("n=4: " + returnTotalNumberOfWays(4));  // Should be 5
    }
}
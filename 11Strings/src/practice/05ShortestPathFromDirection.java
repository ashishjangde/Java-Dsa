 class ShortestPathFromDirection {
    public static float shortestPath(String path){
        float x = 0, y = 0;
        for(int i = 0 ; i < path.length();  i++){
            if(path.charAt(i)=='N'){
                y++;
            }else if(path.charAt(i)=='S'){
                y--;
            }else if(path.charAt(i)=='E'){
                x++;
            }else if(path.charAt(i)=='W'){
                x--;
            }else{
                System.out.println("Invalid direction");
                return -1;
            }
            
        }
        float  X2 = x*x;
        float  Y2 = y*y;
        return (float) Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path: " + shortestPath(path));
    }
}

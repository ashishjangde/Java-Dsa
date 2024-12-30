package practice;

 class FunctionScope {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
    }

    public static void print(){
        // System.out.println(a); // Error: cannot find symbol
        // System.out.println(b); // Error: cannot find symbol
    }
}

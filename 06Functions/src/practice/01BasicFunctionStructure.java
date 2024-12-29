class BasicFunctionStructure {

    public static int sum (int a, int b) { // public is access modifier, static is keyword, int is return type, sum is function name, int a, int b are parameters
        return a + b;
    }

    public static void display() { // public is access modifier, void is return type, display is function name
        System.out.println("Hello World");
    }

    public static void main(String[] args) { // public is access modifier, static is keyword, void is return type, main
                                             // is function name, String[] args is parameter
        display();
        System.out.println(sum(10, 20)); 
    }

}



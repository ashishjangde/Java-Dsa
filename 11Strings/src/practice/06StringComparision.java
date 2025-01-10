 class StringComparision {
    public static void main(String[] args) {
        String a = "ashish";
        String b = "ashish";
        String c = new String("ashish");  // new keyword creates a new memory location

        System.out.println(a == b); // true
        System.out.println(a == c); // false (different memory locations) thats why false 
        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // true

    }
}

 class StringCharAtMethod {
    public static void main(String[] args) {
        
        String str = "Hello World";
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Character at index 6: " + str.charAt(6));
        System.out.println("Character at index 10: " + str.charAt(10));

        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
}

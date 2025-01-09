class PrintLargestString {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango", "Pineapple", "Orange"};
        String largest = "";
        for (String fruit : fruits) {
            if (fruit.length() > largest.length()) {
                largest = fruit;
            }
        }
        System.out.println("Largest string in the array is: " + largest);
    }
}

import java.util.Scanner;

class StringsBasics {
    public static void main(String[] args) {

        // String created using string literal
        String ash = "ashish";

        // String created using the 'new' keyword
        String ashish = new String("Ashish");

        System.out.println("String created using 'new' keyword: " + ashish);

        // Initialize a scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Using sc.next() to read a single word
        System.out.println("Please enter a single word (no spaces):");
        String singleWord = sc.next();
        System.out.println("You entered (sc.next()): " + singleWord);

        // Clear buffer before using sc.nextLine() (unnecessary here but good practice)
        sc.nextLine();

        // Using sc.nextLine() to read an entire line
        System.out.println("Please enter a sentence (it may contain spaces):");
        String fullLine = sc.nextLine();
        System.out.println(fullLine);


        // Close the scanner
        sc.close();
    }
}

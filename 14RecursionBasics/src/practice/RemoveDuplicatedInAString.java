package practice;

public class RemoveDuplicatedInAString {

    public static String removeDuplicatedInAString(String str, int index, StringBuilder sb, boolean[] map) {
        if (index == str.length()) {
            return sb.toString();
        }
        char currentChar = str.charAt(index);
        if (!map[currentChar - 'a']) {
            map[currentChar - 'a'] = true;
            sb.append(currentChar);
        }
        return removeDuplicatedInAString(str, index + 1, sb, map);
    }

    public static void main(String[] args) {
        String input = "aabbccddeeff";
        boolean[] map = new boolean[26];
        StringBuilder sb = new StringBuilder();
        String result = removeDuplicatedInAString(input, 0, sb, map);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result); //
    }
}

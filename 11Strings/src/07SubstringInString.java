class SubstringInString {
   public static String subString(String str , int start, int end){
       String subStr = "";
       for(int i = start; i < end; i++){
           subStr += str.charAt(i);
       }
       return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        // created method subString to get substring from start to end index
        System.out.println("Substring from index 0 to 5: " + subString(str, 0, 5));
        //inbuilt method substring to get substring from start to end index
        System.out.println("Substring from index 5 to 10: " + str.substring(5, 10));
    }
}

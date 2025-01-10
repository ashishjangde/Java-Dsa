package practice;

 class BinaryOperatorAnd {
    public static void main(String[] args) {
        System.out.println("Bitwise AND: " + (5 & 6)); // 4

        /*
Let's break it down step by step:

1. First, convert both numbers to binary:
   5 = 0101 (in binary)
   6 = 0110 (in binary)

2. The & operator compares each bit position:
   0101  (5)
   0110  (6)
   ----
   0100  (result)

3. Rules for bitwise AND (&):
   - 1 & 1 = 1
   - 1 & 0 = 0
   - 0 & 1 = 0
   - 0 & 0 = 0

4. Going through each bit position from right to left:
   - Position 1: 1 & 0 = 0
   - Position 2: 0 & 1 = 0
   - Position 3: 1 & 1 = 1
   - Position 4: 0 & 0 = 0

5. The resulting binary number is 0100
   0100 in binary = 4 in decimal

That's why (5 & 6) equals 4
*/

    }
}

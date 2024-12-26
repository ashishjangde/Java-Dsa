# Java Operators Reference Guide

## Table of Contents
1. [Arithmetic Operators](#arithmetic-operators)
2. [Unary Operators](#unary-operators)
3. [Increment/Decrement Operators](#increment-decrement-operators)
4. [Relational Operators](#relational-operators)
5. [Logical Operators](#logical-operators)
6. [Assignment Operators](#assignment-operators)
7. [Bitwise Operators](#bitwise-operators)

## Arithmetic Operators
Basic mathematical operations.

| Operator | Description    | Example | Result                |
|----------|----------------|---------|-----------------------|
| +        | Addition       | a + b   | Sum of a and b        |
| -        | Subtraction    | a - b   | Difference of a and b |
| *        | Multiplication | a * b   | Product of a and b    |
| /        | Division       | a / b   | Quotient of a and b   |
| %        | Modulus        | a % b   | Remainder of a/b      |

## Unary Operators
Operations on a single operand.

| Operator | Description | Example | Effect                   |
|----------|-------------|---------|--------------------------|
| +        | Unary Plus  | +a      | Indicates positive value |
| -        | Unary Minus | -a      | Negates an expression    |
| !        | Logical NOT | !a      | Inverts boolean value    |
| ~        | Bitwise NOT | ~a      | Inverts all bits         |

## Increment/Decrement Operators
Special operators for adding or subtracting 1.

| Operator | Name           | Example     | Description                               |
|----------|----------------|-------------|-------------------------------------------|
| ++a      | Pre-increment  | int b = ++a | Increments a by 1, then uses the value    |
| a++      | Post-increment | int b = a++ | Uses the value of a, then increments by 1 |
| --a      | Pre-decrement  | int b = --a | Decrements a by 1, then uses the value    |
| a--      | Post-decrement | int b = a-- | Uses the value of a, then decrements by 1 |

### Pre vs Post Increment/Decrement Examples:
```java
// Pre-increment
int a = 5;
int b = ++a;  // a is incremented to 6, then b gets 6
// Now a = 6, b = 6

// Post-increment
int x = 5;
int y = x++;  // y gets 5, then x is incremented to 6
// Now x = 6, y = 5

// Pre-decrement
int m = 5;
int n = --m;  // m is decremented to 4, then n gets 4
// Now m = 4, n = 4

// Post-decrement
int p = 5;
int q = p--;  // q gets 5, then p is decremented to 4
// Now p = 4, q = 5
```

## Relational Operators
Compare two values.

| Operator | Description           | Example | Returns                                 |
|----------|-----------------------|---------|-----------------------------------------|
| ==       | Equal to              | a == b  | true if a equals b                      |
| !=       | Not equal             | a != b  | true if a is not equal to b             |
| >        | Greater than          | a > b   | true if a is greater than b             |
| <        | Less than             | a < b   | true if a is less than b                |
| >=       | Greater than or equal | a >= b  | true if a is greater than or equal to b |
| <=       | Less than or equal    | a <= b  | true if a is less than or equal to b    |

## Logical Operators
Combine boolean values.

| Operator | Description | Example  | Result                                                |
|----------|-------------|----------|-------------------------------------------------------|
| &&       | Logical AND | a && b   | true if both a and b are true                         |
| \|\|     | Logical OR  | a \|\| b | true if either a or b is true                         |
| !        | Logical NOT | !a       | true if a is false                                    |
| &        | Bitwise AND | a & b    | true if both operands are true (evaluates both sides) |
| \|       | Bitwise OR  | a \| b   | true if either operand is true (evaluates both sides) |

## Assignment Operators
Assign values to variables.

| Operator | Example  | Equivalent to |
|----------|----------|---------------|
| =        | a = b    | a = b         |
| +=       | a += b   | a = a + b     |
| -=       | a -= b   | a = a - b     |
| *=       | a *= b   | a = a * b     |
| /=       | a /= b   | a = a / b     |
| %=       | a %= b   | a = a % b     |
| &=       | a &= b   | a = a & b     |
| \|=      | a \|= b  | a = a \| b    |
| ^=       | a ^= b   | a = a ^ b     |
| <<=      | a <<= b  | a = a << b    |
| >>=      | a >>= b  | a = a >> b    |
| >>>=     | a >>>= b | a = a >>> b   |

## Bitwise Operators
Perform bit-level operations.

| Operator | Description          | Example | Operation                                      |
|----------|----------------------|---------|------------------------------------------------|
| &        | Bitwise AND          | a & b   | Sets bit to 1 if both bits are 1               |
| \|       | Bitwise OR           | a \| b  | Sets bit to 1 if any bit is 1                  |
| ^        | Bitwise XOR          | a ^ b   | Sets bit to 1 if bits are different            |
| ~        | Bitwise NOT          | ~a      | Inverts all bits                               |
| <<       | Left shift           | a << n  | Shifts bits left by n positions                |
| >>       | Right shift          | a >> n  | Shifts bits right by n positions               |
| >>>      | Unsigned right shift | a >>> n | Shifts bits right by n positions, fills with 0 |

### Complete Example with Pre/Post Increment/Decrement:

```java
public class OperatorsDemo {
    public static void main(String[] args) {
        // Pre vs Post Increment
        int a = 5;
        System.out.println("Original a: " + a);  // 5

        System.out.println("++a: " + ++a);       // 6 (increments first, then prints)
        System.out.println("a after ++a: " + a); // 6

        System.out.println("a++: " + a++);       // 6 (prints first, then increments)
        System.out.println("a after a++: " + a); // 7

        // Pre vs Post Decrement
        int b = 5;
        System.out.println("\nOriginal b: " + b); // 5

        System.out.println("--b: " + --b);       // 4 (decrements first, then prints)
        System.out.println("b after --b: " + b); // 4

        System.out.println("b--: " + b--);       // 4 (prints first, then decrements)
        System.out.println("b after b--: " + b); // 3

        // Other operators
        int c = 10, d = 3;
        System.out.println("\nArithmetic: " + (c + d));  // 13
        System.out.println("Bitwise AND: " + (c & d));   // 2
        System.out.println("Left Shift: " + (c << 1));   // 20
    }
}
```
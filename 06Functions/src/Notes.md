# Java Functions: A Comprehensive Guide

## Table of Contents
1. [Introduction to Functions](#introduction-to-functions)
2. [Parameter Passing](#parameter-passing)
3. [Function Types and Operations](#function-types-and-operations)
4. [Advanced Function Concepts](#advanced-function-concepts)

## Introduction to Functions
### Function Fundamentals
A function is a reusable block of code that performs a specific task. In Java, functions are defined within classes and are called methods.

#### Anatomy of a Function
```java
[access_modifier] [static] return_type functionName(parameters) {
    // function body
    return value; // if return type is not void
}
```

**Example:** [View Complete Code](practice/01BasicFunctionStructure.java)
```java
public static int sum(int a, int b) {
    return a + b;
}
```

## Parameter Passing
### Call by Value in Java
Java exclusively uses call-by-value parameter passing. Understanding this concept is crucial for proper function implementation.

#### Key Concepts:
1. Original variables remain unchanged
2. Methods receive copies of values
3. Reference types pass copies of references

**Example:** [View Implementation](practice/02CallByValue.java)
```java
// Swap function demonstration
public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
} // Original values remain unchanged
```

## Function Types and Operations
### 1. Mathematical Operations
- **Basic Operations:** Product, Sum
- **Complex Operations:** Factorial, Binomial Coefficient

**Examples:**
- [Product Implementation](practice/03ProdctOfAAndB.java)
- [Factorial Calculation](practice/04FindFactorial.java)
- [Binomial Coefficient](practice/05BinomialCofficient.java)

### 2. Function Overloading
Method overloading allows multiple methods with the same name but different signatures.

#### Overloading Rules:
1. Different parameter types
2. Different number of parameters
3. Different parameter order
4. Return type alone is insufficient

**Example:** [View Overloading Implementation](practice/06FunctionOverloading.java)
```java
public static int add(int a, int b)         // Version 1
public static double add(double a, double b) // Version 2
public static int add(int a, int b, int c)  // Version 3
```

## Advanced Function Concepts
### Prime Number Operations
Three different approaches to prime number calculations, showcasing optimization techniques:

1. **Basic Implementation**
   - Simple iteration approach
   - Time Complexity: O(n)
   - [View Basic Implementation](practice/07NumberIsPrimeOrNot.java)

2. **Optimized Version**
   - Square root optimization
   - Time Complexity: O(√n)
   - [View Optimized Code](practice/08IsPrimeOptimized.java)

3. **Range Operations**
   - Finding primes in a range
   - Uses optimized checking
   - [View Range Implementation](practice/09PrimeNumberInRange.java)

### Best Practices
1. **Function Naming**
   - Use descriptive names
   - Follow camelCase convention
   - Indicate action (e.g., calculateArea, isPrime)

2. **Parameter Design**
   - Limit parameters (ideally ≤ 4)
   - Use appropriate data types
   - Consider parameter order

3. **Return Values**
   - Consistent return types
   - Meaningful return values
   - Proper error handling

4. **Code Organization**
   - Single responsibility principle
   - Clear documentation
   - Consistent formatting

### Common Pitfalls
1. Modifying parameters thinking it affects original values
2. Incorrect overloading implementations
3. Inefficient algorithm choices
4. Poor error handling

## Practice Examples
Each concept includes practical examples. See the complete implementation in the source files linked throughout this document.

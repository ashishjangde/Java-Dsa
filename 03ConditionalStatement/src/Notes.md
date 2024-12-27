# Notes on Conditional Statements

## Table of Contents
1. [Introduction](#1-introduction)
2. [If Statement](#2-if-statement)
3. [If-Else Statement](#3-if-else-statement)
4. [Else-If Ladder](#4-else-if-ladder)
5. [Nested If Statement](#5-nested-if-statement)
6. [Switch Statement](#6-switch-statement)
7. [Ternary Operator](#7-ternary-operator)

## 1. Introduction
Conditional statements are used to perform different actions based on different conditions. They allow the flow of the program to change based on certain conditions.

## 2. If Statement
The `if` statement is used to execute a block of code only if a specified condition is true.

```java
if (condition) {
    // code to be executed if condition is true
}
```

## 3. If-Else Statement
The `if-else` statement is used to execute one block of code if the condition is true, and another block of code if the condition is false.

```java
if (condition) {
    // code to be executed if condition is true
} else {
    // code to be executed if condition is false
}
```

## 4. Else-If Ladder
The `else-if` ladder is used to check multiple conditions. If one of the conditions is true, the corresponding block of code is executed.

```java
if (condition1) {
    // code to be executed if condition1 is true
} else if (condition2) {
    // code to be executed if condition2 is true
} else {
    // code to be executed if all conditions are false
}
```

## 5. Nested If Statement
The `nested if` statement is used to check multiple conditions by placing an `if` statement inside another `if` statement.

```java
if (condition1) {
    // code to be executed if condition1 is true
    if (condition2) {
        // code to be executed if condition2 is true
    }
}
```

## 6. Switch Statement
The `switch` statement is used to execute one block of code from multiple options based on the value of a variable.

```java
switch (variable) {
    case value1:
        // code to be executed if variable equals value1
        break;
    case value2:
        // code to be executed if variable equals value2
        break;
    default:
        // code to be executed if variable does not match any case
}
```

## 7. Ternary Operator
The ternary operator is a shorthand for the `if-else` statement. It takes three operands and returns a value based on the condition.

```java
variable = (condition) ? value_if_true : value_if_false;
```


# Plus Minus Ratio Calculator

This Java program calculates the ratios of positive, negative, and zero values in a given list of integers. It reads input from standard input, processes the data, and prints the ratios formatted to six decimal places.

## Problem Statement

Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. The ratios should be expressed as fractions of the total number of elements in the array.

## Functionality

The program includes a method `plusMinus` which performs the following tasks:

1. Counts the number of positive integers, negative integers, and zeros in the input array.
2. Computes the ratios of positive, negative, and zero integers to the total number of elements.
3. Prints each ratio formatted to six decimal places.

## Input Format

- The first line contains a single integer, `n`, the size of the array.
- The second line contains `n` space-separated integers representing the elements of the array.

### Example Input

```
6
-4 3 -9 0 4 1
```

## Output Format

- Three lines, each containing the ratio of positive numbers, negative numbers, and zeros, respectively, formatted to six decimal places.

### Example Output

```
0.500000
0.333333
0.166667
```

## Usage

1. Compile the Java program:
   ```
   javac Solution.java
   ```

2. Run the program:
   ```
   java Solution
   ```

3. Provide input in the specified format.

## Dependencies

- Java Development Kit (JDK) version 8 or later.


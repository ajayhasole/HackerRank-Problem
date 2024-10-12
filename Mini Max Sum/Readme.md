
# Mini Max Sum

## Description
This program calculates the minimum and maximum sums of four out of five integers from a given list. The function takes a list of integers as input and outputs two values: the minimum sum and the maximum sum.

## Functionality
The program reads a list of integers from standard input, computes the total sum of all integers, and then calculates:
- The minimum sum by excluding the maximum integer.
- The maximum sum by excluding the minimum integer.

## Usage
To run the program, compile and execute it in a Java environment.

### Input Format
- The input consists of a single line containing five space-separated integers.

### Example Input
```
1 2 3 4 5
```

### Output Format
- The output will be a single line containing two space-separated integers:
  - The minimum sum of four integers.
  - The maximum sum of four integers.

### Example Output
```
10 14
```

### Explanation
For the input `1 2 3 4 5`:
- The minimum sum is calculated as `1 + 2 + 3 + 4 = 10`.
- The maximum sum is calculated as `2 + 3 + 4 + 5 = 14`.
